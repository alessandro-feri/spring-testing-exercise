package com.examples.spring.exercise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeWebController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
}
