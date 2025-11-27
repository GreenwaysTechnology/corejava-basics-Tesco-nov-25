package com.tesco.oo.partof;


public class PartofMain {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setType("BMW Engine");
        Car car = new Car();
        car.setModel("BMW X");
        //binding the object /connecting objects during runtime
        car.setEngine(engine);

        //car details
        System.out.println(car.getModel());
        System.out.println(car.getEngine().getType());

    }
}
