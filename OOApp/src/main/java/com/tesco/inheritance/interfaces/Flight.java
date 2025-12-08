package com.tesco.inheritance.interfaces;

public class Flight implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flight flies");
    }
}
