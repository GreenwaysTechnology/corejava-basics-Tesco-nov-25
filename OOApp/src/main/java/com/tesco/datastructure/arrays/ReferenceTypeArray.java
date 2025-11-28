package com.tesco.datastructure.arrays;


public class ReferenceTypeArray {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(1, "Subramanian"),
                new Employee(2, "John"),
                new Employee(3, "James"),
                new Employee(4, "Patrick")
        };
        //traditional for loop
        for (int i = 0; i < employees.length; i++) {
            Employee tempEmp = employees[i];
//            System.out.println(tempEmp.getId() + " " + tempEmp.getName());
            System.out.println(tempEmp);
        }
        //enchanced for loop
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
