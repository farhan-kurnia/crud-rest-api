package com.api.test.crud.repositories;

import com.api.test.crud.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
