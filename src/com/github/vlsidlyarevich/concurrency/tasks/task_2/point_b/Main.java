package com.github.vlsidlyarevich.concurrency.tasks.task_2.point_b;

import java.util.concurrent.CountDownLatch;

/**
 * Created by vlad on 26/03/17.
 */
public class Main {

    private static Integer increment = 0;

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(2);
        (new ConcurrentIncrement(latch)).start();
        (new ConcurrentIncrement(latch)).start();
        latch.await();
        System.out.printf("Result: %d \n", getIncrement());
    }

    public static void increment() {
        synchronized (Main.class) {
            increment++;
        }
    }

    public static Integer getIncrement() {
        synchronized (increment) {
            return increment;
        }
    }
}
