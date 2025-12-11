package org.tesco.streams;

import java.util.List;

public class ConvertToList {
    public static void main(String[] args) {
        List<String> list = List.of("java", "c", "c++").stream().map(String::toUpperCase).toList();
        list.forEach(System.out::println);

    }
}
