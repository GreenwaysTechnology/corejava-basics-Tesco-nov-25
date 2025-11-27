package com.tesco.oo.polymorphism.overloading;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(double a, int i, float b) {
        return (int) (a + i + b);
    }
}
