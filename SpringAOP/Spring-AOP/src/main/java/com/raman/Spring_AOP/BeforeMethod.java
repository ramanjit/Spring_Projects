package com.raman.Spring_AOP;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeMethod implements AfterReturningAdvice{
public void before(Method method, Object[] args, Object target) throws Throwable
{
	System.out.println("Before Method : Before method!");
}

public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable{
	// TODO Auto-generated method stub
	System.out.println("After : After method!");

}
}