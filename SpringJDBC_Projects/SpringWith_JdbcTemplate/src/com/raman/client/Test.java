package com.raman.client;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raman.model.Employee;
import com.raman.service.EmployeeService;
import com.raman.service.Impl.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
	AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("Beans.xml");
	EmployeeService employeeService = ctx.getBean("employeeService", EmployeeServiceImpl.class);
	
	createEmployee(employeeService);
	fetchAllEmployees(employeeService);
	ctx.close();
	}


	private static void fetchAllEmployees(EmployeeService employeeService) {
		List<Employee> empList = employeeService.getAllEmployeeDetails();
		for(Employee employee : empList)
		{
			System.out.println(employee.getEmployeeId() + "\t" + employee.getEmployee_name());
		}
	}
	

	private static void createEmployee(EmployeeService employeeService) {
		Employee emp = new Employee();
		emp.setEmail("raman@yahoo.com");
		emp.setEmployee_name("Ramanjit");
		emp.setEmployeeId(2);
		emp.setSalary(3002);
		emp.setGender("Fe");
		employeeService.addEmployee(emp);
	}

}
