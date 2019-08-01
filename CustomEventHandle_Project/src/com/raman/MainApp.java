package com.raman;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
		         new ClassPathXmlApplicationContext("Beans.xml");
		EventClassPublisher ecp = (EventClassPublisher) context.getBean("customEventPublisher");
	ecp.publish();
	ecp.publish();
	}

}
