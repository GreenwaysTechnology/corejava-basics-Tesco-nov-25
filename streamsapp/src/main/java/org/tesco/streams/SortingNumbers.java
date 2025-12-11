package org.tesco.streams;

import java.util.Arrays;

public class SortingNumbers {
    public static void main(String[] args) {
        Arrays.asList(3, 5, 1, 10, 9, 0, 34).stream().sorted().forEach(System.out::println);
    }
}
