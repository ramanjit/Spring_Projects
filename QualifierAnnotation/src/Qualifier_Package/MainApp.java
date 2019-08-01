package Qualifier_Package;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Profile profile = (Profile) context.getBean("profile1");
		profile.printAge();
		profile.printName();
	
	}

}
