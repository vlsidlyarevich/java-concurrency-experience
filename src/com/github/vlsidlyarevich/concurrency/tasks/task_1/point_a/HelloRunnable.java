package com.github.vlsidlyarevich.concurrency.tasks.task_1.point_a;

/**
 * Created by vlad on 26/03/17.
 */
public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        (new Thread(new HelloRunnable())).start();
    }
}
