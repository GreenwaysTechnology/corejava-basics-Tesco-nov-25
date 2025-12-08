package com.tesco.inheritance.abstractclasses;

public class AbstractMain {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        animal.saveAnimals();
        animal.hunt();
    }
}
