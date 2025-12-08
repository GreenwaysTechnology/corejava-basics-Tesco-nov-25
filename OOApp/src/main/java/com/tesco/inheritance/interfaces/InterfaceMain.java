package com.tesco.inheritance.interfaces;

public class InterfaceMain {
    public static void main(String[] args) {
        //program to sub type
        Bird bird = new Bird();
        bird.fly();
        Flight flight = new Flight();
        flight.fly();
//        Flyable flyable = new Bird();
//        flyable.fly();
        Flyable flyable = null;
        flyable = new Bird();
        flyable.fly();
        //flyable.eat();
        Bird tmpBird = (Bird) flyable;
        tmpBird.eat();
        flyable = new Flight();
        flyable.fly();

    }
}
