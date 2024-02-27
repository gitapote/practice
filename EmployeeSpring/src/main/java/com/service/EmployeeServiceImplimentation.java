package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.dao.EmployeeRepository;
import com.model.Employee;

@Service
public class EmployeeServiceImplimentation implements EmployeeServiceInterface {
	@Autowired
	EmployeeRepository EmpRepo;
	
	public Employee saveEmployee(Employee u) {
		return EmpRepo.save(u);
	}
	
}
