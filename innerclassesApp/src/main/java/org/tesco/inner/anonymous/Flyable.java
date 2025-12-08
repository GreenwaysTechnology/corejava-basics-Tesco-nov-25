package org.tesco.inner.anonymous;

public interface Flyable {
    void fly();
    default  void doStuff(){
        System.out.println("DoStuff");
    }
}
