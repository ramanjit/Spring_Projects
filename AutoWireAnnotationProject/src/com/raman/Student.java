package com.raman;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private Subject subject;

	@Autowired
	public Student(Subject subject)
	{
		System.out.println("Inside Text Editor");
		this.subject = subject;
	}
	
	public void check()
	{
		subject.checkSubject();
	}

}
