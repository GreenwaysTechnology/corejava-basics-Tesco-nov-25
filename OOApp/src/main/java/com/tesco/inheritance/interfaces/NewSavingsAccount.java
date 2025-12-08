package com.tesco.inheritance.interfaces;

public class NewSavingsAccount implements SavingsAccount{
    @Override
    public void deposit() {
        System.out.println("Deposit");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw");
    }
}
