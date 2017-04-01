package com.github.vlsidlyarevich.concurrency.tasks.task_4.point_a;


public class Resource {
    private int content;

    public int get() {
        return content;
    }

    public void add(int value) {
        this.content = value;
    }
}
