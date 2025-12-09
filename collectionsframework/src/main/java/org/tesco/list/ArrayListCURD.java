package org.tesco.list;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

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
}

public class ArrayListCURD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        //menu
        while (true) {
            System.out.println("\n====== EMPLOYEE CRUD MENU ======");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Search Employee by ID");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    employees.add(new Employee(id, name, salary));
                    System.out.println("✔ Employee added!");
                    break;

                case 2:
                    System.out.println("\nEMPLOYEE LIST:");
                    if (employees.isEmpty()) {
                        System.out.println("No records found!");
                    } else {
                        for (Employee employee : employees) {
                            System.out.println(employee);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to update: ");
                    int updateId = sc.nextInt();

                    Employee empToUpdate = null;
                    for (Employee e : employees) {
                        if (e.getId() == updateId) empToUpdate = e;
                    }

                    if (empToUpdate == null) System.out.println("❌ Employee not found!");
                    else {
                        sc.nextLine();
                        System.out.print("Enter new Name: ");
                        empToUpdate.setName(sc.nextLine());

                        System.out.print("Enter new Salary: ");
                        empToUpdate.setSalary(sc.nextDouble());

                        System.out.println("✔ Employee updated!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();

                    employees.removeIf(e -> e.getId() == deleteId);
                    System.out.println("✔ Employee deleted (if existed)");
                    break;

                case 5:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();

                    for (Employee e : employees) {
                        if (e.getId() == searchId) {
                            System.out.println("✔ Found: " + e);
                            break;
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }


    }
}
