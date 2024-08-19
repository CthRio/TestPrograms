package com.ch01.testprogram.temp;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaemonThread implements Runnable {
    private static final Logger logger = Logger.getLogger(DaemonThread.class.getName());
    private final Future<?> infiniteLoopFuture;
    private final Future<?> deadlockFuture;
    private final ExecutorService executor;

    public DaemonThread(Future<?> infiniteLoopFuture, Future<?> deadlockFuture, ExecutorService executor) {
        this.infiniteLoopFuture = infiniteLoopFuture;
        this.deadlockFuture = deadlockFuture;
        this.executor = executor;
    }

    @Override
    public void run() {
        try {
            while (!infiniteLoopFuture.isDone() || (deadlockFuture != null && !deadlockFuture.isDone())) {
                Thread.sleep(1000); // 守护进程每秒检查一次

                // 只在需要的时候检测死锁
                if (deadlockFuture != null) {
                    detectDeadlock();
                }

                if (!infiniteLoopFuture.isDone()) {
                    checkInfiniteLoop();
                }
            }

            if (infiniteLoopFuture.isCancelled()) {
                logger.warning("Infinite loop detected and task was cancelled.");
            } else if (infiniteLoopFuture.isDone()) {
                logger.info("Infinite loop detection task completed.");
            }

            if (deadlockFuture != null) {
                if (deadlockFuture.isCancelled()) {
                    logger.warning("Deadlock detected and task was cancelled.");
                } else if (deadlockFuture.isDone()) {
                    logger.info("Deadlock detection task completed.");
                }
            }

            logger.info("All detection tasks are finished. Generating report...");

            // 输出检测报告
            generateReport();
        } catch (InterruptedException e) {
            logger.log(Level.SEVERE, "Daemon thread interrupted", e);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Exception in daemon thread", e);
        }
    }

    private void detectDeadlock() {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] deadlockedThreadIds = threadMXBean.findDeadlockedThreads();
        if (deadlockedThreadIds != null) {
            ThreadInfo[] threadInfos = threadMXBean.getThreadInfo(deadlockedThreadIds);
            for (ThreadInfo threadInfo : threadInfos) {
                logger.severe("Deadlock detected involving thread: " + threadInfo.getThreadName());
            }
            // 终止所有任务
            executor.shutdownNow();
            logger.severe("Terminating all tasks due to detected deadlock.");
            System.exit(1);
        }
    }

    private void checkInfiniteLoop() {
        try {
            if (infiniteLoopFuture.isDone() || infiniteLoopFuture.isCancelled()) {
                return;
            }

            // 检查任务是否超时
            infiniteLoopFuture.get(1, TimeUnit.SECONDS); // 每秒检查一次
        } catch (TimeoutException e) {
            logger.warning("Infinite loop detected, terminating...");
            infiniteLoopFuture.cancel(true); // 强制终止线程
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Exception during infinite loop check", e);
        }
    }

    private void generateReport() {
        // 这里生成并输出报告
        logger.info("Report: Detection tasks completed. Review the logs for details.");
    }
}