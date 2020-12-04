package com.examples.spring.exercise.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examples.spring.exercise.model.Employee;
import com.examples.spring.exercise.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(long id) {
		return employeeRepository.findById(id)
				.orElse(null);
	}

	public Employee insertNewEmployee(Employee employee) {
		employee.setId(null);
		return employeeRepository.save(employee);
	}

	public Employee updateEmployeeById(long id, Employee replacement) {
		replacement.setId(id);
		return employeeRepository.save(replacement);
	}

}