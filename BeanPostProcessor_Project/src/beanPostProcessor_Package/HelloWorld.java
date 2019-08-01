package beanPostProcessor_Package;


/*
 * 
 * Write, register and use
 * 
 */
public class HelloWorld {
private String message;

public void getMessage() {
	System.out.println("Your Message : " + message);
}

public void setMessage(String message) {
	this.message = message;
}

public void init()
{
System.out.println("Initilaized the bean");	
}

public void destroy()
{
System.out.println("Destroy the bean");
}
	
}
