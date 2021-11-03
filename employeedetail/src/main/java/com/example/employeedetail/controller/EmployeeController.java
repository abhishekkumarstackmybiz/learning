package com.example.employeedetail.controller;

import com.example.employeedetail.entity.EmployeeDetail;
import com.example.employeedetail.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/{id}")
    public EmployeeDetail getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployeeById(@PathVariable int id) {
        return employeeService.deleteEmployeeById(id);
    }

    @GetMapping("/employees")
    public Iterable<EmployeeDetail> getAllEmployeeDetails() {
        return employeeService.getAllEmployee();
    }

    @PostMapping("/save")
    public EmployeeDetail insertEmployeeDetails(@RequestBody EmployeeDetail employeeDetails) {
        return employeeService.insertEmployeeDetail(employeeDetails);
    }

    @PutMapping("/update")
    public EmployeeDetail updateEmployeeDetail(@RequestBody EmployeeDetail employeeDetails) {
        return employeeService.updateEmployeeDetail(employeeDetails);
    }
}
