package com.example.employeedetail.repository;

import com.example.employeedetail.entity.EmployeeDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeDetails, Integer> {
}
