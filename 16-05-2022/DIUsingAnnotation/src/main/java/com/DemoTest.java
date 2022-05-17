package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//BeanFactory bean = new XmlBeanFactory(new ClassPathResource("beans.xml"))
//ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//Employee emp = (Employee)ac.getBean("employee");
//System.out.println(emp);
		
		
AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
	Employee emp = (Employee)ac.getBean("employee");
	System.out.println(emp);
	}

}
