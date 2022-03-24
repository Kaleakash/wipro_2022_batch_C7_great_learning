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
		EmployeeDetails ed = new EmployeeDetails();
		ed.setId(5);
		ed.setName("Balaji");
		//ed.setSkillSet(null);
		
//		SkillSet ss = new SkillSet();
//		ss.setSkillId(100);
//		ss.setSkillName("Python");
//		
//		EmployeeDetails ed1 = new EmployeeDetails();
//		ed1.setId(1);
//		ed1.setName("Raj");
//		
//		EmployeeDetails ed2 = new EmployeeDetails();
//		ed2.setId(2);
//		ed2.setName("Ravi");
//		
//		List<EmployeeDetails> listOfEmp = new ArrayList<>();
//		listOfEmp.add(ed1); listOfEmp.add(ed2);
//		
//		ss.setEmpDetails(listOfEmp);
//		
//		tran.begin();
//				session.save(ss);
//		tran.commit();
//		System.out.println("Record inserted....");
	}

}
