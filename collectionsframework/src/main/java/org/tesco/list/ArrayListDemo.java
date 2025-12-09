package org.tesco.list;

import java.util.ArrayList;

//record Employee(int id, String name, double salary) {
//}

public class ArrayListDemo {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.add("hello");
//        list.add(new Employee(1, "Subramanian"));
//        //access elements
//        for(Object obj:list){
//            System.out.println(obj.id());
//        }
        //Generics - to add specific type into collection

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        for (Integer i : intList) {
            System.out.println(i);
        }

//        ArrayList<Employee> empList = new ArrayList();
//        empList.add(new Employee(1, "Subramanian Murugan", 899.00));
//        for (Employee emp : empList) {
//            System.out.println(emp.id() + " " + emp.name());
//        }

    }
}
