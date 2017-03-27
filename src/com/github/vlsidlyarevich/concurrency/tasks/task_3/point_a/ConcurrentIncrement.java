package com.github.vlsidlyarevich.concurrency.tasks.task_3.point_a;

/**
 * Created by vlad on 26/03/17.
 */
public class ConcurrentIncrement extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            Main.increment++;
        }
        System.out.printf("After thread %d: %d \n", this.getId(), Main.increment);
    }
}
