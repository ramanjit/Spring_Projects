package com.raman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppCofig.class);
		A a = (A) ctx.getBean("aconfiguration");
		a.printMsg("Hello 1");
		B b = (B) ctx.getBean("BConfiguration");
		b.printMsg("Hello 2");
	}

}
