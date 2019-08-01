package beanInheritence_package;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Pojo_class obj = (Pojo_class) context.getBean("helloWorld");
		obj.getMessage1();
		obj.getMessage2();
		
		Hello obj1 = (Hello) context.getBean("helloUS");
		obj1.getMessage1();
		obj1.getMessage2();
		obj1.getMessage3();
		
	}

}
