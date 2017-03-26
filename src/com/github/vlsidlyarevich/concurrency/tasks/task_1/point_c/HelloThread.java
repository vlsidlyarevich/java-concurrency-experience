package com.github.vlsidlyarevich.concurrency.tasks.task_1.point_c;

/**
 * Created by vlad on 26/03/17.
 */
public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.printf("Hello from a thread number %d!\n", super.getId());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            (new HelloThread()).start();
        }
    }
}
