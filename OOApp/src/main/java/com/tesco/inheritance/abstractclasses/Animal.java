package com.tesco.inheritance.abstractclasses;

public abstract class Animal implements HuntAble {
    public abstract void eat();

    public void saveAnimals() {
        System.out.println("Save Animals");
    }
}
