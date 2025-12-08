package com.tesco.inheritance.abstractclasses;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    @Override
    public void hunt() {
        System.out.println("Hunt");
    }
}
