package com.ch01.testprogram.temp;

import java.util.concurrent.*;

public class InfiniteLoopDetector {
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public void runWithTimeout(Runnable runnable, long timeout) throws TimeoutException, InterruptedException {
        final ExecutorService executor = Executors.newSingleThreadExecutor();
        final Future<?> future = executor.submit(runnable);
        scheduler.schedule(() -> future.cancel(true), timeout, TimeUnit.MILLISECONDS);
        try {
            future.get(timeout, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            logInfiniteLoop();
            throw e;
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        } finally {
            executor.shutdownNow();
        }
    }

    private void logInfiniteLoop() {
        // Log infinite loop detection
        System.out.println("Infinite loop detected.");
    }

    public void shutdown() {
        scheduler.shutdownNow();
    }
}

class InfiniteLoopSample {
    public void infiniteLoop() {
        while (true) {
            // Infinite loop
            if (Thread.currentThread().isInterrupted()) {
                break; // Exit loop if interrupted
            }
        }
    }
}
