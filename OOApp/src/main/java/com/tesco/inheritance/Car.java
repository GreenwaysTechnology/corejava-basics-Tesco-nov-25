package com.tesco.inheritance;

//car class now connected with vehicle class
//all vechile properties are shared to car, so cant need not declare properties again
//car is child class and where as Vehicle is parent class
public class Car extends Vehicle {
    private int doors;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
