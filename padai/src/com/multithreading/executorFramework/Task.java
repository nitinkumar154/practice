package com.multithreading.executorFramework;

public class Task implements Runnable{
    String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("thread name "+Thread.currentThread().getName()+" message is "+this.taskName);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("end of thread "+Thread.currentThread().getName());

    }

}
