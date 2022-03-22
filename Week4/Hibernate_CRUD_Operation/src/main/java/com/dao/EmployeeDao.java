package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;

public class EmployeeDao {

	public int storeEmployee(Employee emp) {
		try {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();	// Equal to connection reference. 
		Session session = sf.openSession();		// Statement or PreparedStatement 
		Transaction tran = session.getTransaction();
		
		tran.begin();
				session.save(emp);
		tran.commit();
		return 1;
		}catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	
}
