package com.github.vlsidlyarevich.concurrency.tasks.task_2.point_b;

import java.util.concurrent.CountDownLatch;

/**
 * Created by vlad on 26/03/17.
 */
public class ConcurrentIncrement extends Thread {

    private CountDownLatch latch;

    public ConcurrentIncrement(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            Main.increment();
        }
        System.out.printf("After thread %d: %d \n", this.getId(), Main.getIncrement());
        latch.countDown();
    }
}
