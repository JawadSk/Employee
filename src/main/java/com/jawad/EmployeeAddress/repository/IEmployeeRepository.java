package com.jawad.EmployeeAddress.repository;

import com.jawad.EmployeeAddress.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends CrudRepository<Employee, Long> {
}
