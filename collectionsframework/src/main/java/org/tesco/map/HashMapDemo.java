package org.tesco.map;

import java.util.HashMap;

class Employee {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
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
}

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Alice");
        map.put(8999, "Murugan");
        map.put(2, "Subramanian");
        System.out.println(map);

        HashMap<Integer, Employee> empMap = new HashMap<>();
        empMap.put(1, new Employee(1, "Ram"));
        empMap.put(100, new Employee(2, "Karthik"));
        empMap.put(18733, new Employee(3, "Kumar"));
        empMap.put(454, new Employee(45, "Subu"));
        System.out.println(empMap);

    }
}
