package com.ch01.testprogram.temp;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockDetector implements Runnable {
    private static final ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
    private final long checkInterval;
    private volatile boolean deadlockDetected;

    public DeadlockDetector(long checkInterval) {
        this.checkInterval = checkInterval;
        this.deadlockDetected = false;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted() && !deadlockDetected) {
            long[] threadIds = threadMXBean.findDeadlockedThreads();
            if (threadIds != null) {
                ThreadInfo[] threadInfos = threadMXBean.getThreadInfo(threadIds);
                logDeadlock(threadInfos);
                deadlockDetected = true;
                break;
            }
            try {
                Thread.sleep(checkInterval);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    private void logDeadlock(ThreadInfo[] threadInfos) {
        // Log deadlock details
        System.out.println("Deadlock detected:");
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println(threadInfo.toString());
        }
    }

    public boolean isDeadlockDetected() {
        return deadlockDetected;
    }
}

class DeadlockSample {
    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public void method1() {
        lock1.lock();
        try {
            Thread.sleep(50); // Simulate work
            lock2.lock();
            try {
                // Critical section
            } finally {
                lock2.unlock();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock1.unlock();
        }
    }

    public void method2() {
        lock2.lock();
        try {
            Thread.sleep(50); // Simulate work
            lock1.lock();
            try {
                // Critical section
            } finally {
                lock1.unlock();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock2.unlock();
        }
    }
}
