package com.tesco.oo.lang.object;

public class LangMain {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
        System.out.println(greeter.toString());

        //Program to Super type
        Object hello = new Greeter();
        System.out.println(hello.toString());
        Greeter tmpGreeter = (Greeter) hello;
        System.out.println(tmpGreeter.sayHello());
    }
}
