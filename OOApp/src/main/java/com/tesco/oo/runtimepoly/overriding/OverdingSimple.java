package com.tesco.oo.runtimepoly.overriding;

public class OverdingSimple {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Animal animal = new Dog();
        animal.eat();
        Dog tmpDog = (Dog) animal;
        tmpDog.bark();
        //Cannot resolve method 'bark' in 'Animal'
        // animal.bark();


    }
}
