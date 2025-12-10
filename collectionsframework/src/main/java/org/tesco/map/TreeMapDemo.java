package org.tesco.map;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Alice");
        map.put(8999, "Murugan");
        map.put(2, "Subramanian");
        System.out.println(map);

        TreeMap<Integer, Employee> empMap = new TreeMap<>();
        empMap.put(1, new Employee(1, "Ram"));
        empMap.put(100, new Employee(2, "Karthik"));
        empMap.put(18733, new Employee(3, "Kumar"));
        empMap.put(454, new Employee(45, "Subu"));
        System.out.println(empMap);
    }
}
