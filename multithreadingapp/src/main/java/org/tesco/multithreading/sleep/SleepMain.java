package org.tesco.multithreading.sleep;

public class SleepMain {
    public static void main(String[] args) {
        new Thread(new DownloaderThread()).start();

        Thread uploaderThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    System.out.println("UploaderThread is downloading...");
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        uploaderThread.start();
    }
}
