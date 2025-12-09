package org.tesco.multithreading;

public class HelloWorldThread extends Thread {
    @Override
    public void run() {
        //Thread logic
        System.out.println("Hello!: " + Thread.currentThread().getName());
    }
}
