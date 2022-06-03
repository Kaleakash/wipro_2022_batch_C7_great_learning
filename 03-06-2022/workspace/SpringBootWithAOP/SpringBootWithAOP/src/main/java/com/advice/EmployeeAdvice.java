package com.advice;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAdvice {

	@Pointcut("execution(* com.service.EmployeeService.*(..))")
	private void setAdvice() {
		
	}
	
	@Before("setAdvice()")
	public void beforeAdvice() {
		System.out.println("This code execute before business method");
	}
	@After("setAdvice()")
	public void AfterAdvice() {
		System.out.println("This code execute after business method");
	}
	
	@Around("setAdvice()")
	public void roundAdvice(ProceedingJoinPoint jp) {
		try {
				System.out.println("Before method in Around");
			jp.proceed();
				System.out.println("After method in Around");
		} catch (Throwable e) {
			// TODO: handle exception
		}
	}
	@AfterThrowing("setAdvice()")
	public void afterThrowException() {
		System.out.println("It will execute only if business method throw exception");
	}
}
