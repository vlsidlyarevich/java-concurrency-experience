package com.github.vlsidlyarevich.concurrency.tasks.task_4.point_a;

/**
 * Created by vlad on 01/04/17.
 */
public class Main {

    public static void main(String[] args) {
        Resource resource = new Resource();
        Consumer consumer = new Consumer(resource);
        Producer producer = new Producer(resource);

        consumer.start();
        producer.start();
    }
}
