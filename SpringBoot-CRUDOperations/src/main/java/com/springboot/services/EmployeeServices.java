package com.springboot.services;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.springboot.beans.Employee;

public class EmployeeServices {
	
	private static Map<Integer, Employee> employees = new HashMap<>();
	public static int index;
	
	static {
		Employee emp1 = new Employee(1, "Sai", "IT", 22000);
		Employee emp2 = new Employee(2, "Ram", "IT", 22000);
		employees.put(1, emp1);
		employees.put(2, emp2);
	}

	public static List<Employee> getAllEmployees() {
		
		return new ArrayList<>(employees.values());
	}
	
	public static Employee getEmployeeDetails(int id) {
		return employees.get(id);
	}

	public static Employee addEmployee(Employee employee) {
		index += 1;
		employee.setId(index);
		employees.put(index, employee);
		return employee;
	}

	public static Employee updateemployee(int id, Employee employee) {
		employee.setId(index);
		employees.put(index, employee);
		return employee;
	}

	public static Employee deleteEmployee(int id) {
		
		return employees.remove(id);
	}

	
	
}
