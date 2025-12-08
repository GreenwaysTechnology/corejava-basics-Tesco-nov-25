package com.tesco.inheritance.interfaces.multipleinheritance;

import com.tesco.inheritance.interfaces.Flyable;

public class Bird implements Flyable, Eatable {

    @Override
    public void fly() {
        System.out.println("Bird flies");
    }

    @Override
    public void eat() {
        System.out.println("Bird eats");
    }
}
