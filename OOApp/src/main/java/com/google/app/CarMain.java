package com.google.app;

import com.tesco.transport.Car;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "BMW";
        car.start();
        car.acclerate(3);
        car.stop();


    }
}
