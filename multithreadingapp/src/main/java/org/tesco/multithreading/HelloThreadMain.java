package org.tesco.multithreading;

public class HelloThreadMain {
    public static void main(String[] args) {
        HelloWorldThread helloWorldThread = new HelloWorldThread();
        helloWorldThread.start();
    }
}
