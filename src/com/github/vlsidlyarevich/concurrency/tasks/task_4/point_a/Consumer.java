package com.github.vlsidlyarevich.concurrency.tasks.task_4.point_a;

/**
 * Created by vlad on 01/04/17.
 */
public class Consumer extends Thread {

    private Resource resource;

    public Consumer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        super.run();
    }
}
