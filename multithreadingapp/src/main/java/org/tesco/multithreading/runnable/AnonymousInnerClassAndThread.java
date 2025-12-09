package org.tesco.multithreading.runnable;

public class AnonymousInnerClassAndThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Movie Thread....");
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Downloader Thread....");
            }
        });
        thread2.start();
    }
}
