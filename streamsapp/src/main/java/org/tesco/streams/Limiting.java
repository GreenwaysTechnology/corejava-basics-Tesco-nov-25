package org.tesco.streams;

import java.util.Arrays;

public class Limiting {
    public static void main(String[] args) {
        Arrays.asList(3, 5, 1, 10, 9, 10, 34)
                .stream()
                .sorted() //sort
                .distinct() // remove duplicates
                .limit(3) //only first 3 elements
                .forEach(System.out::println);
    }
}
