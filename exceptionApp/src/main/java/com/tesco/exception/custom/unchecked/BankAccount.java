package com.tesco.exception.custom.unchecked;

public class BankAccount {
    private double balance = 5000;

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance.Available :" + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successfull.Remaining: " + balance);
    }
}
