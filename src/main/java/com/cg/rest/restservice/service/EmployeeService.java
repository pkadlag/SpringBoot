package com.cg.rest.restservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.rest.restservice.entity.Employee;

@Service
public interface EmployeeService {
	

	public void addNewEmployee(Employee employee);

	public List<Employee> getAllEmployees();
	

}