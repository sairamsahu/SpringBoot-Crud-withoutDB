package com.springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.beans.Employee;
import com.springboot.services.EmployeeServices;

@RestController
public class EmployeeController {

	
	@GetMapping("/employees")
	public  List<Employee> getAllEmployees() {
		return EmployeeServices.getAllEmployees();
	}
	
	@GetMapping("/employees/{id}")
	public  Employee getEmployeeDetails (@PathVariable int id) {
		return EmployeeServices.getEmployeeDetails(id);
	}
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return EmployeeServices.addEmployee(employee);
	}
	
	@PutMapping("/updateEmployee/{id}") 
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
		return EmployeeServices.updateemployee(id,employee);
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public Employee deleteEmployee(@PathVariable int id) {
		return EmployeeServices.deleteEmployee(id);
	}
}
