package com.tesco.oo.hasa;

public class HasaMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId("1");
        employee.setName("Subramanian");

        Department department = new Department();
        department.setName("Development");
        //binding
        department.setEmployee(employee);

        System.out.println(department.getName() + " => " + department.getEmployee().getName());

    }
}
