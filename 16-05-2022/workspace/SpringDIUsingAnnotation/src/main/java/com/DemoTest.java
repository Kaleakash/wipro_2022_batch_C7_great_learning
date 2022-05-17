package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac  = new ClassPathXmlApplicationContext("beans.xml");
Employee emp = (Employee)ac.getBean("employee");
System.out.println(emp);
	}

}
