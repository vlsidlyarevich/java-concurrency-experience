package com.github.vlsidlyarevich.concurrency.tasks.task_3.point_a;

/**
 * Created by vlad on 27/03/17.
 */
public class ConcurrentReader extends Thread {

    @Override
    public void run() {
        System.out.printf("Info from thread %d: %d \n", this.getId(), Main.increment);
    }
}
