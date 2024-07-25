package com.tns.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tns.project.entity.Employee;
import com.tns.project.service.EmployeeService;

@RestController

public class Employeecontroller {
@Autowired
EmployeeService employeeService;
	 
	@PostMapping("/employee")
	 public Employee saveEmployee(@RequestBody Employee employee) {
	   return employeeService.saveEmployee(employee);
	   
	}
	@GetMapping("/employee")
	public List<Employee>fetchEmployeelist(){
		return employeeService.fetchEmployeelist();
	}
	
	@GetMapping("/employee/{id}")
	public Employee fetchEmployeeById(@PathVariable("id")Long EmployeeId) {
		return employeeService.fetchEmployeeById(EmployeeId);
	}
	
	@DeleteMapping("/employee/{id}")
	
	public String deleteEmployeeById(@PathVariable("id")Long EmployeeId) {
		employeeService.deleteEmployeeById(EmployeeId);
        return "Employee deleted Successfully";
	}
	@PutMapping("/employee/{id}")
	 
	public Employee updateEmployee(@PathVariable("id")Long EmployeeId,
		@RequestBody Employee employee) {
		return employeeService.updateEmployee(EmployeeId,employee);
	}
	
	}
	
	
	
	

