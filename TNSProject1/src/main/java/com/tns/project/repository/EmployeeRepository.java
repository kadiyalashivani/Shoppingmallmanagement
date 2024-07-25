package com.tns.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.project.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	
}
