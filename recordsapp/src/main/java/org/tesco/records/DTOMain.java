package org.tesco.records;

public class DTOMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(33);
        employee.setName("Ram");
        Employee employee1 = new Employee(1, "Raja");
        System.out.println(employee1.toString());
        System.out.println(employee);
        System.out.println(employee.hashCode());
    }
}
