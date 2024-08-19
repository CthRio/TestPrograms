package com.ch01.testprogram.temp;

import java.lang.reflect.Method;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MutationTesting {

    private static final Logger logger = Logger.getLogger(MutationTesting.class.getName());

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.ch01.testprogram.temp.TestClass");
            Method infiniteLoopMethod = clazz.getMethod("complexInfiniteLoopMethod");
            Method deadlockMethod = clazz.getMethod("complexDeadlockMethod");

            ExecutorService executor = Executors.newFixedThreadPool(2);
            Future<?> infiniteLoopFuture = executor.submit(new InfiniteLoopTask(clazz, infiniteLoopMethod, logger));
            Future<?> deadlockFuture = null;

            // 只在需要的时候启动死锁检测任务
//            if (args.length > 0 && args[0].equals("deadlock")) {
                deadlockFuture = executor.submit(new DeadlockTaskWrapper(clazz, deadlockMethod, logger));
//            }

            DaemonThread daemon = new DaemonThread(infiniteLoopFuture, deadlockFuture, executor);
            Thread daemonThread = new Thread(daemon);
            daemonThread.setDaemon(true);
            daemonThread.start();

            executor.shutdown();
            if (!executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS)) {
                logger.severe("Tasks did not complete in the expected time.");
            }

            logger.info("Detection process completed.");

            System.out.println("提示：主进程正常退出。");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Exception occurred", e);
        }
    }

    static class InfiniteLoopTask implements Runnable {
        private final Class<?> clazz;
        private final Method method;
        private final Logger logger;

        InfiniteLoopTask(Class<?> clazz, Method method, Logger logger) {
            this.clazz = clazz;
            this.method = method;
            this.logger = logger;
        }

        @Override
        public void run() {
            try {
                logger.info("Invoking method: " + method.getName());
                method.invoke(clazz.getDeclaredConstructor().newInstance());
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Exception during method invocation", e);
            }
        }
    }

    static class DeadlockTaskWrapper implements Runnable {
        private final Class<?> clazz;
        private final Method method;
        private final Logger logger;

        DeadlockTaskWrapper(Class<?> clazz, Method method, Logger logger) {
            this.clazz = clazz;
            this.method = method;
            this.logger = logger;
        }

        @Override
        public void run() {
            try {
                logger.info("Invoking method: " + method.getName());
                method.invoke(clazz.getDeclaredConstructor().newInstance());
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Exception during method invocation", e);
            }
        }
    }
}