package com.raman.Aspect.Model;

public class Circle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(" ****** It is called after 'Before' method *****");
	}

}