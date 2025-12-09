package org.tesco.multithreading.runnable;

public class SavingsAccount extends Account implements Runnable {
    @Override
    public void run() {
        System.out.println("Savings Account Thread");
    }
}
