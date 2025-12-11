package org.tesco.annoations;

public class Service {

    @MyInfo(author = "Subramanian", date = "2025-11-10", version = 2)
    public void process() {
        System.out.println("Processing data...");
    }
}
