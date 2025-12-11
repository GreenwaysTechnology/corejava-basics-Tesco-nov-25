package org.tesco.streams;

import java.util.List;
import java.util.stream.Stream;

public class MapStream {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //data process: i want to double the numbers the in list
        Stream<Integer> intsStream = integerList.stream();
        //process the data
        intsStream.map(n -> n * 2).forEach(value -> System.out.println(value));

        //in stream data processing methods are called as "operators" - map
        List.of("java", "c", "c++").stream().map(s -> s.toUpperCase()).forEach(n -> System.out.println(n));
        List.of("java", "c", "c++").stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
