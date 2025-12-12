package org.tesco.controller;

import org.springframework.web.bind.annotation.*;
import org.tesco.controller.model.Employee;

import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/api/employees")
    public List<Employee> findEmployees() {
        List<Employee> employeeList = List.of(
                new Employee(1, "Subramanian"),
                new Employee(2, "Murugan")
        );
        return employeeList;
    }

    @PostMapping("/api/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        System.out.println(employee);
//        Todo: insert this employee into datbase
        return employee;
    }

    //update logic
    @PutMapping("/api/employees/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        System.out.println(employee);
        return employee;
    }

    @DeleteMapping("/api/employees/{id}")
    public boolean removeEmployee(@PathVariable int id) {
        System.out.println(id);
        return true;
    }

}
