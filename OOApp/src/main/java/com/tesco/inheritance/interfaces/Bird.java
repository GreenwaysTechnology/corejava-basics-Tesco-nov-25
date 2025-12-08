package com.tesco.inheritance.interfaces;

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Birds are fly");
    }

    public void eat() {
        System.out.println("Birds Eat!!");
    }
}
