package com.tesco.inheritance.interfaces.concremethods;

public class BasePayment implements PaymentGateway {

    @Override
    public void pay(double amount) {
        System.out.println("Amount" + amount);

    }

    @Override
    public boolean refund(double amount) {
        System.out.println("Refund");
        return true;
    }
}
