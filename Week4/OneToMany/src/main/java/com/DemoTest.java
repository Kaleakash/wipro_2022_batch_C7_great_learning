package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		Project p1 = new Project();
		p1.setPid(1123);
		p1.setProjectName("Python Project");

		Employees emp1 = new Employees();
		emp1.setEid(3);
		emp1.setEmpname("Ajay");
		emp1.setEpid(1123);
		
		Employees emp2 = new Employees();
		
		emp2.setEid(4);
		emp2.setEmpname("Balaji");
		emp2.setEpid(1123);
		
		List<Employees> listOfEmp = new ArrayList<>();
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		p1.setListOfEmp(listOfEmp);
		
		tran.begin();
					session.save(p1);
					//session.save(emp1);
					//session.save(emp2);
		tran.commit();
		System.out.println("Record inserted");
	}

}
