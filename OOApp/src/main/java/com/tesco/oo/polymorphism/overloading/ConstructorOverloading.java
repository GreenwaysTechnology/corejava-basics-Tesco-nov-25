package com.tesco.oo.polymorphism.overloading;

public class ConstructorOverloading {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer(1, "Test");
        Customer customer3 = new Customer(1, "Test", "City");
        Customer customer4 = new Customer(1, "test", "city", 45);


        System.out.println(customer3.getCity() + customer3.getName());
    }
}
