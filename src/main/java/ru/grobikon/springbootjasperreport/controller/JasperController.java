package ru.grobikon.springbootjasperreport.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.sf.jasperreports.engine.JRException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.grobikon.springbootjasperreport.entity.Employee;
import ru.grobikon.springbootjasperreport.repository.EmployeeRepository;
import ru.grobikon.springbootjasperreport.service.ReportService;

import java.io.FileNotFoundException;
import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
public class JasperController {

    private final EmployeeRepository repository;
    private final ReportService service;

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees() {

        return repository.findAll();
    }

    @GetMapping("/report/{format}")
    public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportReport(format);
    }
}
