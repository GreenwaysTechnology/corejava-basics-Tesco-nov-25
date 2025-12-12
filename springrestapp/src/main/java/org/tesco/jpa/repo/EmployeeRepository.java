package org.tesco.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tesco.jpa.entity.Employee;

//save,findById,findAll,delete ...
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
