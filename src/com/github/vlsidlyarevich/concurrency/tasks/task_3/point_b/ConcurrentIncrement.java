package com.github.vlsidlyarevich.concurrency.tasks.task_3.point_b;

/**
 * Created by vlad on 26/03/17.
 */
public class ConcurrentIncrement extends Thread {

    private static boolean done = false;

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            Main.increment++;
        }
        setDone(true);
        System.out.printf("After thread %d: %d \n", this.getId(), Main.increment);
    }

    public synchronized static boolean isDone() {
        return done;
    }

    public synchronized static void setDone(boolean done) {
        ConcurrentIncrement.done = done;
    }
}
