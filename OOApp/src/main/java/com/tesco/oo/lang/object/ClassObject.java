package com.tesco.oo.lang.object;

public class ClassObject {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.getClass().getName());
    }
}
