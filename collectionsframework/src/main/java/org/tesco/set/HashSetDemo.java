package org.tesco.set;

import java.util.HashSet;
import java.util.Objects;

//class Employee implements Comparable<Employee> {
//    private int id;
//    private String name;
//
//    public Employee(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//
//    @Override
//    public int compareTo(Employee o) {
//        return Integer.compare(this.id, o.id);
//    }
//}

class Employee{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(2);
        intSet.add(10);
        intSet.add(1);
        System.out.println(intSet);

        HashSet<String> strSet = new HashSet<>();
        strSet.add("Apple");
        strSet.add("orange");
        strSet.add("Sugar");
        strSet.add("Sugar");
        System.out.println(strSet);


        HashSet<Employee> employeesSet = new HashSet<>();
        employeesSet.add(new Employee(1, "Subramanian"));
        employeesSet.add(new Employee(2, "Murugan"));
        employeesSet.add(new Employee(3, "Ram"));
        employeesSet.add(new Employee(3, "Ram"));


    }
}
