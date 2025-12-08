package org.tesco.inner.methodlocal;

public class Outter {
    public void doStuff() {
        int a = 10;
        class Inner {
            public void innerMethod() {
                System.out.println("Inner method");
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }
}
