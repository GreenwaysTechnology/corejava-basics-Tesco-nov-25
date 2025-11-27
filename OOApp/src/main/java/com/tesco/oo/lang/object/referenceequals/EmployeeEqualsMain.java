package com.tesco.oo.lang.object.referenceequals;

public class EmployeeEqualsMain {
    public static void main(String[] args) {
        Employee empOne = new Employee(1, "Subramanian");
        Employee empTwo = new Employee(2, "Subramanian");
        //equal operator
//        if (empOne == empTwo) {
//            System.out.println("Employees are equal");
//        } else {
//            System.out.println("Employees are not equal");
//        }
        //
//        Employee empThree = empOne;
//
//        if (empOne == empThree) {
//            System.out.println("Employees are equal");
//        } else {
//            System.out.println("Employees are not equal");
//        }

        if (empOne.equals(empTwo)) {
            System.out.println("Employees are equal");
        } else {
            System.out.println("Employees are not equal");
        }

    }
}
