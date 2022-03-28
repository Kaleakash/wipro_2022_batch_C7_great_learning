package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

public class DemoTest {

	public static void main(String[] args) {
		/*
		 * Configuration con = new Configuration();
		 * con.configure("hibernate.cfg.xml")
		 * SessionFactory sf = con.buildSessionFactory();
		 * Session session = sf.openSession();
		 * Transaction tran = session.getTransaction();
		 * tran.begin 
		 * 	session.save(emp);
		 * tran.commit();
		 */
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");	// it load persistence.xml
	EntityManager manager = emf.createEntityManager();
	EntityTransaction tran = manager.getTransaction();
	Project pp = new Project();
	pp.setPid(100);
	pp.setName("Python");
	tran.begin();
		manager.persist(pp);   // it is equal to save method 	
	tran.commit();
	System.out.println("Record inserted successfully");
	
	/*
	 * 
	 * manager.merge(pp) it is like a update 
	 * manager.find();		it is like a get 
	 * manager.createQuery("select proj from Project proj");
	 */
			
			
	}

}
