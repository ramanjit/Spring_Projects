package com.raman;

public class ABean {
	private Bbean bbean;
	private String name;
	public Bbean getBbean() {
		return bbean;
	}
	public void setBbean(Bbean bbean) {
		this.bbean = bbean;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void b()
	{
		bbean.check();
	}
	

}
