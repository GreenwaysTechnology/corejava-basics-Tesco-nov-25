package org.tesco.multithreading.raceconditions;

class BankAccount {
    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        String name = Thread.currentThread().getName();
        if (balance >= amount) {
            System.out.println(name + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(name + " remaining " + balance);
        } else {
            System.out.println(name + "- Insufficient balance");
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


public class BankSynchronized {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        UserThread t1 = new UserThread(account, "User-1");
        UserThread t2 = new UserThread(account, "User-2");
        t1.start();
        t2.start();

    }
}
