package com.tesco.transport;

public class Car {
    //state
    public String name;
    public int speed;

    //behaviour //methods
    public void start() {
        System.out.println(name + " Started");
    }

    public void acclerate(int increment) {
        speed += increment;
        System.out.println("Speed is now : " + speed);
    }

    public void stop() {
        speed = 0;
        System.out.println(name + " Stopped");
    }
}
