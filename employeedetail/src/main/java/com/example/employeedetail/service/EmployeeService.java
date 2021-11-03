package com.example.employeedetail.service;

import com.example.employeedetail.entity.EmployeeDetail;
import com.example.employeedetail.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeDetail getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Iterable<EmployeeDetail> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public EmployeeDetail updateEmployeeDetail(EmployeeDetail employeeDetails) {
        EmployeeDetail existingData = employeeRepository.findById(employeeDetails.getId()).orElse(null);
        existingData.setName(employeeDetails.getName());
        existingData.setEmail(employeeDetails.getEmail());
        existingData.setDob(employeeDetails.getDob());
        existingData.setDepartment(employeeDetails.getDepartment());
        return employeeRepository.save(existingData);
    }

    public EmployeeDetail insertEmployeeDetail(EmployeeDetail employeeDetails) {
        return employeeRepository.save(employeeDetails);
    }

    public String deleteEmployeeById(int id) {
        employeeRepository.deleteById(id);
        return "Employee Removed";
    }
}
