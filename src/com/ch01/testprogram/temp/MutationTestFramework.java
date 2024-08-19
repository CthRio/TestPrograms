package com.ch01.testprogram.temp;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.*;

public class MutationTestFramework {

    private static final ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
    private static final long CYCLE_DETECT_TIMEOUT = 5000; // 循环检测超时时间，毫秒

    public static void main(String[] args) {
        try {
            // 示例用法
            Class<?> clazz = Class.forName("com.ch01.testprogram.temp.TestSubject");
            Method method = clazz.getMethod("complexTestMethod");
            Method cycleMethod = clazz.getMethod("complexCycleMethod"); // 死循环方法

            // 设置超时时间（毫秒）
            long timeout = 15000;
            Thread currentThread = Thread.currentThread(); // 获取当前线程

            // 检测死锁
            MutationTestFramework framework = new MutationTestFramework();
            String result = framework.runTest(clazz, method, timeout, currentThread);
            System.out.println(result);

            // 检测死循环
            MutationTestFramework framework2 = new MutationTestFramework();
            String result2 = framework2.runTest(clazz, cycleMethod, timeout, currentThread);
            System.out.println("Thread result msg: " + result2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String runTest(Class<?> clazz, Method method, long timeout, Thread cntThread) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);


        Future<String> future = executor.submit(() -> {
            try {
                // 反射执行方法
                method.invoke(clazz.getDeclaredConstructor().newInstance());
                return "Test Passed";
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                return "Test Failed with Exception: " + cause.getMessage();
            } catch (Exception e) {
                return "Test Failed with Exception: " + e.getMessage();
            }
        });

        // 定期检查死锁任务
        ScheduledFuture<?> deadlockCheckFuture = scheduler.scheduleAtFixedRate(() -> {
            String deadlockCheck = detectDeadlock();
            if (!deadlockCheck.equals("No deadlock detected")) {
                future.cancel(true); // 超时取消任务
                interruptDeadlockedThreads(cntThread); // 中断死锁相关线程
                System.out.println("Test Failed: Deadlock detected\n" + deadlockCheck);
            }
        }, 1, 1, TimeUnit.SECONDS); // 每秒检查一次死锁

        try {
            while (!future.isDone()) {
                try {
                    return future.get(timeout, TimeUnit.MILLISECONDS);
                } catch (TimeoutException e) {
                    // 检查死循环
                    String cycleCheck = detectCycle(method, timeout);
                    if (!cycleCheck.equals("No cycle detected")) {
                        future.cancel(true); // 超时取消任务
                        interruptAllThreads(cntThread); // 中断所有线程
                        return "Test Failed: Cycle detected\n" + cycleCheck;
                    }
                } catch (CancellationException e){
                    return "Thread is cancelling...\n";
                }
            }
            return future.get();
        } catch (InterruptedException | ExecutionException e) {
            String msg = e.getMessage();
            return "Test Failed with Exception: "
                    + (msg == null ?
                    "(terminated)" : msg);
        } finally {
            deadlockCheckFuture.cancel(true); // 停止定期死锁检测任务
            scheduler.shutdownNow(); // 关闭调度器
            executor.shutdownNow(); // 关闭执行器
        }
    }

    public static String detectDeadlock() {
        long[] deadlockedThreads = threadMXBean.findDeadlockedThreads();
        if (deadlockedThreads != null && deadlockedThreads.length > 0) {
            ThreadInfo[] threadInfos = threadMXBean.getThreadInfo(deadlockedThreads);
            StringBuilder sb = new StringBuilder("Deadlock detected:\n");
            for (ThreadInfo threadInfo : threadInfos) {
                sb.append(threadInfo.toString()).append("\n");
            }
            return sb.toString();
        }
        return "No deadlock detected";
    }

    public static String detectCycle(Method cycleMethod, long timeout) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(() -> {
            try {
                // 反射执行循环检测方法
                cycleMethod.invoke(null); // 假设方法是静态方法
                return "No cycle detected";
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                return "Cycle detected with Exception: " + cause.getMessage();
            } catch (Exception e) {
                return "Cycle detected with Exception: " + e.getMessage();
            }
        });

        try {
            return future.get(CYCLE_DETECT_TIMEOUT, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            future.cancel(true); // 超时取消任务
            return "Cycle detected: Timeout occurred";
        } catch (InterruptedException | ExecutionException e) {
            return "Cycle detected with Exception: " + e.getMessage();
        } finally {
            executor.shutdownNow(); // 关闭执行器
        }
    }

    private static void interruptDeadlockedThreads(Thread mainThread) {
        long[] deadlockedThreads = threadMXBean.findDeadlockedThreads();
        if (deadlockedThreads != null) {
            for (long threadId : deadlockedThreads) {
                ThreadInfo threadInfo = threadMXBean.getThreadInfo(threadId);
                if (threadInfo != null) {
                    Thread thread = findThreadById(threadInfo.getThreadId());
                    if (thread != null && thread != mainThread) {
                        thread.interrupt();
                    }
                }
            }
        }
    }

    private static Thread findThreadById(long threadId) {
        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
        for (Thread thread : threadSet) {
            if (thread.getId() == threadId) {
                return thread;
            }
        }
        return null;
    }

    private static void interruptAllThreads(Thread cntThread) {
        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
        for (Thread thread : threadSet) {
            if (thread != cntThread && thread.getState() != Thread.State.TERMINATED) {
                thread.interrupt();
            }
        }
    }
}