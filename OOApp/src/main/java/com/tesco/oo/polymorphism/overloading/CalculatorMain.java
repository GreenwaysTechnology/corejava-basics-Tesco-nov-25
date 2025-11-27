package com.tesco.oo.polymorphism.overloading;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(19, 2));
        System.out.println(calculator.add(19, 2,89));
        System.out.println(calculator.add(12.8, 2,9.0f));

    }
}
