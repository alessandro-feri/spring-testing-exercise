package com.examples.spring.exercise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.spring.exercise.model.Employee;
import com.examples.spring.exercise.services.EmployeeService;

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/api/employees")
	public List<Employee> allEmployees() {
		return employeeService.getAllEmployees();
	}
} 