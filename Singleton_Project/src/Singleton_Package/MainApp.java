package Singleton_Package;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		POJO_class obj = (POJO_class)context.getBean("helloWorld");
		obj.setMessage("I am Object A");
		obj.getMessage();
		
		POJO_class obj1 = (POJO_class)context.getBean("helloWorld");
		obj1.getMessage();
		
	}

}
