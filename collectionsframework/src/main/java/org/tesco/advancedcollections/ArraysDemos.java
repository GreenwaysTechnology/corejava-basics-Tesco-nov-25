package org.tesco.advancedcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDemos {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4, 5};
        List<Integer> integerList = Arrays.asList(ints);
        System.out.println(integerList);
    }
}
