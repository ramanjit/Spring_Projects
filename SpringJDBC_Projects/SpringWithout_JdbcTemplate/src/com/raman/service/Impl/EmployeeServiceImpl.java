package com.raman.service.Impl;

import java.util.List;

import com.raman.dao.EmployeeDAO;
import com.raman.model.Employee;
import com.raman.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeDAO.createEmployee(employee);
	}

	@Override
	public Employee fetchEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeeById(employeeId);
	}

	@Override
	public void removeEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		employeeDAO.deleteEmployeeById(employeeId);
	}

	@Override
	public void upgradeEmployeeById(String newEmail, int employeeId) {
		// TODO Auto-generated method stub
		employeeDAO.updateEmployeeById(newEmail, employeeId);
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllEmployeeDetails();
	}

}