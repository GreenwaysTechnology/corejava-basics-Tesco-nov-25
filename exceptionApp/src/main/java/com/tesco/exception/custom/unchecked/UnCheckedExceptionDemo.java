package com.tesco.exception.custom.unchecked;

public class UnCheckedExceptionDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

//        bankAccount.withdraw(6000);

        try {
            bankAccount.withdraw(6000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

    }
}
