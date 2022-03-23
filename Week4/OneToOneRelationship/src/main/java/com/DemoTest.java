package com;

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
		
		Person p = new Person();
		p.setPid(1);
		p.setPname("Raj");
		
		Passport pp = new Passport();
		pp.setPpid(1122);
		pp.setDescription("Indian Passport");
		p.setPassport(pp);
		tran.begin();
			session.save(p);
			//session.save(pp);
		tran.commit();
		System.out.println("Record inserted successfully");
	}

}
