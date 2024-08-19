package com.ch01.testprogram.temp;

import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

class TestClass {
    private static final Logger logger = Logger.getLogger(TestClass.class.getName());

    public void complexInfiniteLoopMethod() {
        int i = 0;
        while (!Thread.currentThread().isInterrupted() && i >= 0) {
            // 更复杂的无限循环
            if (i == Integer.MAX_VALUE) {
                i = 0;
            }
            i++;
        }
        if (Thread.currentThread().isInterrupted()) {
            logger.info("Infinite loop method interrupted and exiting.");
        }
    }

    public void complexDeadlockMethod() {
        final ReentrantLock lock1 = new ReentrantLock();
        final ReentrantLock lock2 = new ReentrantLock();
        final ReentrantLock lock3 = new ReentrantLock();

        Thread t1 = new Thread(new DeadlockTask(lock1, lock2, lock3, logger, "Thread 1"));
        Thread t2 = new Thread(new DeadlockTask(lock2, lock3, lock1, logger, "Thread 2"));
        Thread t3 = new Thread(new DeadlockTask(lock3, lock1, lock2, logger, "Thread 3"));

        t1.start();
        t2.start();
        t3.start();
    }

    static class DeadlockTask implements Runnable {
        private final ReentrantLock lock1;
        private final ReentrantLock lock2;
        private final ReentrantLock lock3;
        private final Logger logger;
        private final String threadName;

        DeadlockTask(ReentrantLock lock1, ReentrantLock lock2, ReentrantLock lock3, Logger logger, String threadName) {
            this.lock1 = lock1;
            this.lock2 = lock2;
            this.lock3 = lock3;
            this.logger = logger;
            this.threadName = threadName;
        }

        @Override
        public void run() {
            try {
                logger.info(threadName + " attempting to lock lock1");
                lock1.lock();
                Thread.sleep(100);
                logger.info(threadName + " attempting to lock lock2");
                lock2.lock();
                Thread.sleep(100);
                logger.info(threadName + " attempting to lock lock3");
                lock3.lock();
            } catch (InterruptedException e) {
                logger.log(Level.SEVERE, threadName + " interrupted", e);
//                // 响应中断信号
//                Thread.currentThread().interrupt();
            } finally {
                if (lock1.isHeldByCurrentThread()) {
                    lock1.unlock();
                }
                if (lock2.isHeldByCurrentThread()) {
                    lock2.unlock();
                }
                if (lock3.isHeldByCurrentThread()) {
                    lock3.unlock();
                }
            }
        }
    }
}