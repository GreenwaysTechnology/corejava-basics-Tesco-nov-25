package org.tesco.inner.staticinner;

public class StaticInnerDemo {
    public static void main(String[] args) {
        Outter.Inner inner = new Outter.Inner();
        inner.innerMethod();
    }
}
