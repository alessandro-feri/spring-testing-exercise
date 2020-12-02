package com.examples.spring.exercise.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.spring.exercise.model.Employee;

@RestController
public class EmployeeRestController {

	@GetMapping("/api/employees")
	public List<Employee> allEmployees() {
		return Collections.emptyList();
	}
} 