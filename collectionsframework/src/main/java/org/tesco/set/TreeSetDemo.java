package org.tesco.set;

import java.util.Comparator;
import java.util.TreeSet;

class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

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

//        TreeSet<Employee> employeesSet = new TreeSet<>(new EmployeeComparator());
        TreeSet<Employee> employeesSet = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getId(), o2.getId());
            }
        });
        employeesSet.add(new Employee(1, "Subramanian"));
        employeesSet.add(new Employee(2, "Murugan"));
        employeesSet.add(new Employee(3, "Ram"));
        employeesSet.add(new Employee(3, "Ram"));
        System.out.println(employeesSet);


    }
}
