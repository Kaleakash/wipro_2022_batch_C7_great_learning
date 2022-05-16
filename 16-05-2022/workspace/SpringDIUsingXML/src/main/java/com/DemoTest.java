package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		//Employee emp = new Employee();
		//emp.display();
		
		//Resource res = new ClassPathResource("beans.xml");
		//BeanFactory bean = new XmlBeanFactory(res);
		BeanFactory bean = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		
//		Employee emp1 	= (Employee)bean.getBean("obj1");		// pull the object from container 
//		emp1.display();
//		
//		Employee emp2 	= (Employee)bean.getBean("obj1");		// pull the object from container 
//		emp2.display();
//		
//		Employee emp3 	= (Employee)bean.getBean("obj2");		// pull the object from container 
//		emp3.display();
//		
//		Employee emp4 	= (Employee)bean.getBean("obj2");		// pull the object from container 
//		emp4.display();
		
		Employee emp5 = (Employee)bean.getBean("obj1");			// empty constructor 
		System.out.println(emp5);
		
		Employee emp6 = (Employee)bean.getBean("obj3");			// parameter constructor 
		System.out.println(emp6);
		
		Employee emp7 = (Employee)bean.getBean("obj4");			// setter base di
		System.out.println(emp7);
		
	}

}
