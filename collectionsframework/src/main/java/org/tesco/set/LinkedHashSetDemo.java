package org.tesco.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> intSet = new LinkedHashSet<>();
        intSet.add(20);
        intSet.add(1);
        intSet.add(2);
        intSet.add(10);
        intSet.add(1);
        System.out.println(intSet);

        LinkedHashSet<String> strSet = new LinkedHashSet<>();
        strSet.add("Apple");
        strSet.add("orange");
        strSet.add("Sugar");
        strSet.add("Sugar");
        System.out.println(strSet);

        LinkedHashSet<Employee> employeesSet = new LinkedHashSet<>();
        employeesSet.add(new Employee(1, "Subramanian"));
        employeesSet.add(new Employee(2, "Murugan"));
        employeesSet.add(new Employee(3,"Ram"));
        employeesSet.add(new Employee(3,"Ram"));

        System.out.println(employeesSet);

    }
}
