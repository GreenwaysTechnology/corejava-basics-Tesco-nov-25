package com.tesco.inheritance;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("BMW");
        car.setSpeed(33);
        car.setDoors(4);
        System.out.println(car.getBrand());
        System.out.println(car.getSpeed());
        System.out.println(car.getDoors());

        //Truck
        Truck truck = new Truck();
        truck.setBrand("Tata");
        truck.setSpeed(180);
        truck.setLoadCapacity(5000);
        System.out.println(truck.getBrand());
        System.out.println(truck.getSpeed());
        System.out.println(truck.getLoadCapacity());

        //Bike
        Bike bike = new Bike();
        bike.setBrand("Hero Honda");
        bike.setSpeed(140);
        System.out.println(bike.getBrand());
        System.out.println(bike.getSpeed());

    }
}
