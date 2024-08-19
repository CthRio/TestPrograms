package com.ch01.testprogram.temp;

public class TestSubject {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();
    private final Object lock3 = new Object();

    public void complexTestMethod() {
        Thread t1 = new Thread(() -> {
            try {
                synchronized (lock1) {
                    Thread.sleep(100);
                    synchronized (lock2) {
                        System.out.println("Thread 1 acquired lock1 and lock2");
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Thread 1 interrupted");
                Thread.currentThread().interrupt(); // 恢复中断状态
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                synchronized (lock2) {
                    Thread.sleep(100);
                    synchronized (lock3) {
                        System.out.println("Thread 2 acquired lock2 and lock3");
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Thread 2 interrupted");
                Thread.currentThread().interrupt(); // 恢复中断状态
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                synchronized (lock3) {
                    Thread.sleep(100);
                    synchronized (lock1) {
                        System.out.println("Thread 3 acquired lock3 and lock1");
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Thread 3 interrupted");
                Thread.currentThread().interrupt(); // 恢复中断状态
            }
        });

        t1.setDaemon(true); // 设置为守护线程
        t2.setDaemon(true); // 设置为守护线程
        t3.setDaemon(true); // 设置为守护线程

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
            Thread.currentThread().interrupt(); // 恢复中断状态
        }
    }

    public static void complexCycleMethod() {
        for (int i = 0; i < 20; i++) {  // 模拟复杂死循环
            if(i > 10)
                --i;

            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Received thread interrupt instruction.");
                break;
            }
        }

    }
}
