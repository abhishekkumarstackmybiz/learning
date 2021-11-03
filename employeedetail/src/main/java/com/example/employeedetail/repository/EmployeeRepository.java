package com.example.employeedetail.repository;

import com.example.employeedetail.entity.EmployeeDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeDetail, Integer> {
}
