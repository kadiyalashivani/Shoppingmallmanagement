package com.tns.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tns.project.entity.Employee;

@Service
public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> fetchEmployeelist();

	Employee fetchEmployeeById(Long employeeId);

	void deleteEmployeeById(Long employeeId);

	Employee updateEmployee(Long employeeId, Employee employee);

}
