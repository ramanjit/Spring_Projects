package com.raman.dao;

import java.util.List;

import com.raman.model.Employee;

public interface EmployeeDAO {
	
	
	/*
	 Perform CRUD Operation
	 */
	public abstract void createEmployee(Employee employee);
	public abstract Employee getEmployeeById(int employeeId);
	public abstract void deleteEmployeeById(int employeeId);
	public abstract void updateEmployeeById(String newEmail, int employeeId);
	public abstract List<Employee> getAllEmployeeDetails();
}
