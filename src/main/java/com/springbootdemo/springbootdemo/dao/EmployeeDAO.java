package com.springbootdemo.springbootdemo.dao;

import java.util.List;

import com.springbootdemo.springbootdemo.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
