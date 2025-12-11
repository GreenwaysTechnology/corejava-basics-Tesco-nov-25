package org.tesco.streams;

import java.util.List;

public class Counting {
    public static void main(String[] args) {
        long counter = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().count();
        System.out.println(counter + "elements found");
    }
}
