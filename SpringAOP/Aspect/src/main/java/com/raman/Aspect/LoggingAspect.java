package com.raman.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//Become aspect
@Aspect
public class LoggingAspect {

	@Before("allGetter() && allCircleMethods()") // advice method run before
													// getName
	public void LoggingAdvice() {
		System.out.println("Advice run. Get Method Called");
		System.out.println();
	}

	// info about actual method call that has triggered via advice
	@Before("allCircleMethods()") // advice method run before getName
	public void LoggingAdvice1(JoinPoint joinPoint) {
		System.out.println(joinPoint.toString());
		System.out.println();
	}

	@Before("allCircleMethods()") // advice method run before getName
	public void LoggingAdvice2(JoinPoint joinPoint) {
		System.out.println(joinPoint.getTarget());
		System.out.println();
	}

	@Before("args(String)") // advice method run before getName
	public void LoggingAdvice3() {
		System.out.println("A method that take string arguments has been called");
		System.out.println();
	}

	@Before("allGetter()") // advice method run before getName
	public void secondAdvice() {
		System.out.println("Second advice is executed");
		System.out.println();
	}

	// Pointcut matches with the methods
	// Such as allGetter with all Getter methods
	@Pointcut("execution(public * get*())")
	public void allGetter() {

	}

	@Pointcut("within(com.raman.Aspect.Model.*)")
	public void allCircleMethods() {

	}

	@After("allCircleMethods()")
	public void afterMethod() {
		System.out.println("**** Run After Method()***** ");
		System.out.println();
	}

	/*
	 * @AfterReturning It is returned sucessfully only if target method executed
	 * sucessfully.
	 */

	/*
	 * AfterThrowing : For throwing exception
	 */
	
	// To get the object after return

}
