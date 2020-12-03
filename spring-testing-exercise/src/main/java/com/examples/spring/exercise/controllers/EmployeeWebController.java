package com.examples.spring.exercise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.examples.spring.exercise.model.Employee;
import com.examples.spring.exercise.services.EmployeeService;

@Controller
public class EmployeeWebController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	public String index(Model model) {
		List<Employee> allEmployees = employeeService.getAllEmployees();
		model.addAttribute("employees", allEmployees);
		model.addAttribute("message", allEmployees.isEmpty() ? "No employee" : "");
		
		return "index";
	}
	
}
