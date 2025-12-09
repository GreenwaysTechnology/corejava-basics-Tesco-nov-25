package org.tesco.multithreading;

public class HaiThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hai !: " + Thread.currentThread().getName());
    }
}
