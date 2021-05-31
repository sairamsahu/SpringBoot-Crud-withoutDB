package com.springboot.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
@Service
@Repository
public class Employee {

	
	private int id;
	private String name;
	private String Department;
	private int salary;
	
}
