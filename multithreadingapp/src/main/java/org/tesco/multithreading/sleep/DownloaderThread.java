package org.tesco.multithreading.sleep;

public class DownloaderThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Going to sleep....");

        try {
            Thread.sleep(5000);
            System.out.println("Get up!");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
