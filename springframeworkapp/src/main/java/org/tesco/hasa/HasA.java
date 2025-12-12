package org.tesco.hasa;

public class HasA {
    public static void main(String[] args) {
        Address address = new Address("Coimbatore");
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Subramnaian Murugan");
        //linking object
        employee.setAddress(address);
        System.out.println(employee);

    }
}
