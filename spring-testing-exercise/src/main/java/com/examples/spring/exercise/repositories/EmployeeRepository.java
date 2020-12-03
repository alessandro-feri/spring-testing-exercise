package com.examples.spring.exercise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examples.spring.exercise.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
