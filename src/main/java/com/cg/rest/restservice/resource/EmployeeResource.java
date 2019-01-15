package com.cg.rest.restservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rest.restservice.entity.Employee;
import com.cg.rest.restservice.service.EmployeeService;

@RestController
@RequestMapping("/employees") // Addressable resource
public class EmployeeResource {

	@Autowired
	private EmployeeService service;

	@PostMapping // Uniform Constraint Interface
	public void addNewEmployee(@RequestBody Employee employee) {
		service.addNewEmployee(employee);
	}

	@GetMapping // Uniform Constraint Interface
	// @RequestMapping(method = RequestMethod.GET, produces = { "application/json",
	// "application/xml" })
	//@Produces
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}
}
