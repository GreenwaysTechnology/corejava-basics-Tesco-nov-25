package org.tesco.multithreading;

public class MultiThreading {
    public static void main(String[] args) {
        HelloWorldThread helloWorldThread = new HelloWorldThread();
        helloWorldThread.start();
        HaiThread haiThread = new HaiThread();
        haiThread.start();
    }
}
