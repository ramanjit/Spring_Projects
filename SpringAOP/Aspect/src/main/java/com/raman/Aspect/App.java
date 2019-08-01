package com.raman.Aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raman.Aspect.service.ShapeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService shapeService = (ShapeService) context.getBean("shapeService",ShapeService.class);
        shapeService.getCircle().setName("Dummy name"); 
        System.out.println(shapeService.getCircle().getName());
    }
}
