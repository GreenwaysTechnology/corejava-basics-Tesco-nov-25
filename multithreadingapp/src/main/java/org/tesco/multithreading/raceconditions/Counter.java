package org.tesco.multithreading.raceconditions;

//shared resource
public class Counter {
    int counter = 0;
    //only thread can modify the state at a time.
    public synchronized void increment() {
        System.out.println(Thread.currentThread().getName());
        counter++;
    }
}
