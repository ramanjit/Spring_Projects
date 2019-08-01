

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		AddressCollection obj = (AddressCollection) context.getBean("address");
		obj.getAddressList();
		obj.getAddressProp();
		obj.getAddressSet();
		obj.getAdressMap();

	}

}
