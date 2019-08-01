package com.demo.bean;

public class UserBean {
	
	private int id;
	private String name;
	private double balance;
	
	public UserBean()
	{
		
	}
	
	
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}



	public UserBean(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amt)
	{
		balance += amt;
	}

}
