package com.raman.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.raman.dao.EmployeeDAO;
import com.raman.model.Employee;

public class EmployeeDAOimpl implements EmployeeDAO {


	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public void createEmployee(Employee employee) {
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = dataSource.getConnection();
			String sql = "insert into employee_table(employee_name, email, gender, salary) values(?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, employee.getEmployee_name());
			ps.setInt(2, employee.getSalary());
			ps.setString(3, employee.getGender());
			ps.setInt(4, employee.getSalary());
			int executeUpdate = ps.executeUpdate();
			if(executeUpdate > 0)
			{
				System.out.println("Employee is created.....");
			}
		}catch(Exception e)
			{
				e.printStackTrace();
			}finally{
				if(con != null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return null;	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		
	}

	@Override
	public void updateEmployeeById(String newEmail, int employeeId) {
		
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return null;}

}
