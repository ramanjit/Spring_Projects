package com.raman.JdbcTemplate;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	
	private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public int saveEmployee(Employee e)
	{
	String query = "insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getAge()+"')";
	return jdbctemplate.update(query);	
	}
	
	public int updateEmployee(Employee e)
	{
		String query="update employee set name='"+e.getName()+"',age='"+e.getAge()+"' where id='"+e.getId()+"' ";  
			    return jdbctemplate.update(query);  }
	
	public int deleteEmployee(Employee e)
	{
		 String query="delete from employee where id='"+e.getId()+"' ";  
		    return jdbctemplate.update(query);  
	}
	
}
