package com.tesco.oo.lang.object;

public class Greeter {
    public String sayHello() {
        return "Hello";
    }

    @Override
    public String toString() {
        return "Greeter Class";
    }

    @Override
    public int hashCode() {
        return 34343434 * 34;
    }

}
