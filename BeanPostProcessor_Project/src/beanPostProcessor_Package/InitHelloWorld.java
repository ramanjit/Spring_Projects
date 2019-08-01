package beanPostProcessor_Package;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
public class InitHelloWorld implements BeanPostProcessor{
public Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException
{
System.out.println("Before Intialization : " + beanName);	
return bean;
}
public Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException
{
System.out.println("After Intialization : " + beanName);	
return bean;
}

	
}
