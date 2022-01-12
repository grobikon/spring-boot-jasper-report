package ru.grobikon.springbootjasperreport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.grobikon.springbootjasperreport.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
