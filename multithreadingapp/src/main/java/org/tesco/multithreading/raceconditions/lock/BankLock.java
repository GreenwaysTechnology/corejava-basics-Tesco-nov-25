package org.tesco.multithreading.raceconditions.lock;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private int balance = 1000;
    //create lock
    private final Lock locker = new ReentrantLock();

    public void withdraw(int amount) {
        String name = Thread.currentThread().getName();
        locker.lock();
        try {
            if (balance >= amount) {
                System.out.println(name + " is withdrawing " + amount);
                balance -= amount;
                System.out.println(name + " remaining " + balance);
            } else {
                System.out.println(name + "- Insufficient balance");
            }
        } catch (Exception e) {

        } finally {
            locker.unlock();
        }
    }
}

class UserThread extends Thread {
    private BankAccount account;

    public UserThread(BankAccount account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        account.withdraw(700);
    }
}


public class BankLock {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        UserThread t1 = new UserThread(account, "User-1");
        UserThread t2 = new UserThread(account, "User-2");
        t1.start();
        t2.start();

    }
}
