package com.github.vlsidlyarevich.concurrency.tasks.task_4.point_a;

/**
 * Created by vlad on 01/04/17.
 */
public class Producer extends Thread {

    private Resource resource;

    public Producer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            resource.add(i);
            System.out.println("Producer #" + this.getId() + " producing:" + i);
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
