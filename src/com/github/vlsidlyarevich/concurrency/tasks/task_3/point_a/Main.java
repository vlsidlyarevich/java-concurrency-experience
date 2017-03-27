package com.github.vlsidlyarevich.concurrency.tasks.task_3.point_a;

/**
 * Created by vlad on 26/03/17.
 */
public class Main {

    public static int increment;

    public static void main(String[] args) {
        (new ConcurrentIncrement()).start();
        (new ConcurrentReader()).start();
    }
}
