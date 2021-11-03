package com.example.employeedetail.controller;

import com.example.employeedetail.entity.EmployeeDetails;
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

    @GetMapping("/getById/{id}")
    public EmployeeDetails getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteEmployeeById(@PathVariable int id) {
        return employeeService.deleteEmployeeById(id);
    }

    @GetMapping("/allEmployee")
    public Iterable<EmployeeDetails> getAllEmployeeDetails() {
        return employeeService.getAllEmployee();
    }

    @PostMapping("/saveEmployeeRecord")
    public EmployeeDetails insertEmployeeDetails(@RequestBody EmployeeDetails employeeDetails) {
        return employeeService.insertEmployeeDetail(employeeDetails);
    }

    @PutMapping("/updateEmployee")
    public EmployeeDetails updateEmployeeDetail(@RequestBody EmployeeDetails employeeDetails) {
        return employeeService.updateEmployeeDetail(employeeDetails);
    }
}
