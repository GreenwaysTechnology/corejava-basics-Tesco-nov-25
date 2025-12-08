package com.tesco.inheritance.interfaces.concremethods;

public class InterfaceDefaultMethods {
    public static void main(String[] args) {
        System.out.println(PaymentGateway.PROVIDER);
        PaymentGateway paymentGateway = new BasePayment();
        paymentGateway.pay(1000);
        paymentGateway.refund(2000);
        paymentGateway.printReceipt(1000);
        PaymentGateway.logTransaction("Printed");
    }
}
