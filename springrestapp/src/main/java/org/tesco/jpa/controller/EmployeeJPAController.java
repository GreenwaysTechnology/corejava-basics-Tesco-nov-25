package org.tesco.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tesco.jpa.EmployeeService;
import org.tesco.jpa.entity.Employee;

import java.util.List;

@RestController
@RequestMapping("/jpa")
public class EmployeeJPAController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable Long id) {
        return employeeService.findById(id);
    }

    @PutMapping("/employees/{id}")
    public Employee update(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.update(id, employee);
    }

    @DeleteMapping("/employees/{id}")
    public String delete(@PathVariable Long id) {
        employeeService.delete(id);
        return "Employee deleted";
    }

    @PostMapping("/employees")
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }
}
