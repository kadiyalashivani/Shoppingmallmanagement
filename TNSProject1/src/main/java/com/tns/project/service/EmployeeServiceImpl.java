package com.tns.project.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.project.entity.Employee;
import com.tns.project.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired 
	EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> fetchEmployeelist() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee fetchEmployeeById(Long employeeId) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(employeeId).get();
	}

	@Override
	public void deleteEmployeeById(Long employeeId) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(employeeId);
	}

	@Override
	public Employee updateEmployee(Long employeeId, Employee employee) {
		// TODO Auto-generated method stub
		Employee employeeDB=employeeRepository.findById(employeeId).get();
		
		if(Objects.nonNull(employee.getName()) &&
				!"".equalsIgnoreCase(employee.getName())) {
			employeeDB.setName(employee.getName());
		}
		if(Objects.nonNull(employee.getDob()) &&
				!"".equalsIgnoreCase(employee.getDob())) {
			employeeDB.setDob(employee.getDob());
		}
		
		
		return employeeRepository.save(employeeDB);
	}
	

}
