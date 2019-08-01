package com.raman.service;

import java.util.List;

import com.raman.model.Employee;

public interface EmployeeService {
	public abstract void addEmployee(Employee employee);
	public abstract Employee fetchEmployeeById(int employeeId);
	public abstract void removeEmployeeById(int employeeId);
	public abstract void upgradeEmployeeById(String newEmail, int employeeId);
	public abstract List<Employee> getAllEmployeeDetails();

}
