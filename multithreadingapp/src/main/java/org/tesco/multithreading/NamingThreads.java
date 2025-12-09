package org.tesco.multithreading;

public class NamingThreads {
    public static void main(String[] args) {
        HelloWorldThread helloWorldThread = new HelloWorldThread();
        helloWorldThread.setName("HelloThread");
        helloWorldThread.start();
        HaiThread haiThread = new HaiThread();
        haiThread.setName("HaiThread");
        haiThread.start();

    }
}
