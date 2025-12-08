package com.tesco.inheritance.interfaces.concremethods;

public interface PaymentGateway {
    //non static variable
    double amount = 1000;
    //static variable
    static String PROVIDER = "GOOGLE PAY";

    void pay(double amount);

    boolean refund(double amount);

    //default methods - instance methods
    default void printReceipt(double amount) {
        System.out.println("Receipt printed for amount: " + amount);
    }

    //static methods
    static void logTransaction(String message) {
        System.out.println("LOG: " + message);
    }


}
