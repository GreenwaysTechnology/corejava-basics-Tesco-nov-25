package org.tesco.multithreading.runnable;

public class RunnableMain {
    public static void main(String[] args) {
        //Runnable Target
        SavingsAccount savingsAccount = new SavingsAccount();
        Thread savingsAccountThread = new Thread(savingsAccount);
        savingsAccountThread.start();
        Thread sbAccThread = new Thread(new SavingsAccount());
        sbAccThread.start();
        new Thread(new SavingsAccount()).start();
    }
}
