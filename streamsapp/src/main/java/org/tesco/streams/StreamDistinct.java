package org.tesco.streams;

import java.util.Arrays;

public class StreamDistinct {
    public static void main(String[] args) {
        Arrays.asList(3, 5, 1, 10, 9, 10, 34)
                .stream()
                .sorted()
                .distinct()
                .forEach(System.out::println);

    }
}
