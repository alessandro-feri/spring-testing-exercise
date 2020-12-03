package com.examples.spring.exercise.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examples.spring.exercise.model.Employee;

/**
 * Temporary fake implementation of service.
 */
@Service
public class EmployeeService {

	private static final String TEMPORARY_IMPLEMENTATION = "Temporary implementation";

	public List<Employee> getAllEmployees() {
		throw new UnsupportedOperationException(TEMPORARY_IMPLEMENTATION);
	}

} 