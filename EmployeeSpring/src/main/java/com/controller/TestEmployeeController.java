package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.service.EmployeeServiceInterface;

@RestController
public class TestEmployeeController {
	
	@Autowired
	EmployeeServiceInterface empService;

	//to post data from client to server and call by mapping
//	@PostMapping("/add")
//	public Employee addUser(@RequestBody Employee u) {
//		return empService.saveEmployee(u);
//	}
	
	public Employee addEmp(@RequestBody Employee e) {
		return empService.saveEmployee(e);
	}
}
