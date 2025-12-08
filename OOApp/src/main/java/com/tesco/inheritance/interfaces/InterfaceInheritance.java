package com.tesco.inheritance.interfaces;

public class InterfaceInheritance {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new NewSavingsAccount();
        savingsAccount.withdraw();
        savingsAccount.deposit();
    }
}
