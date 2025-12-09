package org.tesco.multithreading.executorservice.runnable;

public class HelloTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Task is running in : " + Thread.currentThread().getName());
    }
}
