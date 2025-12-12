package org.tesco.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tesco.jpa.entity.Employee;
import org.tesco.jpa.repo.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public List<Employee> findAll() {
        return repository.findAll();
    }

    public Employee findById(Long id) {
        return repository.findById(id).orElse(new Employee(1l, "name", 0.0));
    }

    public Employee update(Long id, Employee employee) {
        Employee emp = findById(id);
        emp.setName(employee.getName());
        employee.setSalary(employee.getSalary());
        return repository.save(emp);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Employee save(Employee employee) {
        return repository.save(employee);
    }
}
