package com.github.vlsidlyarevich.concurrency.tasks.task_4.point_a;


public class Resource {
    private int content;
    private boolean available = true;

    public synchronized int get() {
        if (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        notifyAll();
        return content;
    }

    public synchronized void add(int value) {
        if (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        content = value;
        available = true;
        notifyAll();
    }
}
