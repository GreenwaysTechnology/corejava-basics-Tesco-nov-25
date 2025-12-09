package org.tesco.multithreading.executorservice.runnable;

public class ThreadTask {
    public static void main(String[] args) {
        Thread thread  = new Thread(new HelloTask());
        thread.start();
    }
}
