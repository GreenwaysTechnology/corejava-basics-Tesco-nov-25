package org.tesco.streams;

import java.util.Arrays;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeStream {
    public static void main(String[] args) {
        Arrays.asList(
                        new Employee(1, "Subramanian", 100),
                        new Employee(2, "Murugan", 10000),
                        new Employee(3, "Karthik", 8000)
                )
                .stream()
                .filter(employee -> employee.getSalary() > 5000)
                .map(employee -> employee.getName().toUpperCase())
                .forEach(System.out::println);
    }
}
