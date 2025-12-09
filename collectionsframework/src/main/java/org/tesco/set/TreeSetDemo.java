package org.tesco.set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> intSet = new TreeSet<>();
        intSet.add(20);
        intSet.add(1);
        intSet.add(2);
        intSet.add(10);
        intSet.add(1);
        System.out.println(intSet);

        TreeSet<String> strSet = new TreeSet<>();
        strSet.add("Apple");
        strSet.add("orange");
        strSet.add("Sugar");
        strSet.add("Sugar");
        System.out.println(strSet);

        TreeSet<Employee> employeesSet = new TreeSet<>();
        employeesSet.add(new Employee(1, "Subramanian"));
        employeesSet.add(new Employee(2, "Murugan"));
        employeesSet.add(new Employee(3,"Ram"));
        employeesSet.add(new Employee(3,"Ram"));
    }
}
