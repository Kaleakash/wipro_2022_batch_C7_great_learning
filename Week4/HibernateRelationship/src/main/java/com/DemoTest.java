package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
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
		
//		Trainer t1 = new Trainer();
//		t1.setTid(3);
//		t1.setTname("Mahesh");
//		t1.setTech("Angular");
		
//		tran.begin();
//				session.save(t1);
//		tran.commit();
//		System.out.println("Record stored successfully");
		
//		Student s1 = new Student();
//		s1.setSid(104);
//		s1.setSname("Keeta");
//		s1.setAge(24);
//		s1.setTsid(3);
//		
//		tran.begin();
//				session.save(s1);
//		tran.commit();
//		System.out.println("Record stored successfully..");
		
//		Trainer t1 = new Trainer();
//		t1.setTid(2);
//		t1.setTname("Ajay");
//		t1.setTech("Java");
//		
//		Student s1 = new Student();
//		s1.setSid(102);
//		s1.setSname("Meeta");
//		s1.setAge(24);
//		s1.setTsid(2);
//		
//		Student s2 = new Student();
//		s2.setSid(103);
//		s2.setSname("Veeta");
//		s2.setAge(24);
//		s2.setTsid(2);
//
//		List<Student> listOfStd = new ArrayList<>();
//		listOfStd.add(s1);
//		listOfStd.add(s2);
//		
//		t1.setListOfStd(listOfStd);
//		
//		tran.begin();
//				session.save(t1);
//				//session.save(s1);
//				//session.save(s2);
//		tran.commit();
//		System.out.println("Record stored successfully");
		
//		Trainer t = session.get(Trainer.class, 1);
//		if(t==null) {
//				System.out.println("Trainer record not present");
//		}else {
//				//System.out.println("Trainer record present");
//				tran.begin();
//					session.delete(t);
//				tran.commit();
//				System.out.println("Trainer record deletetd...");
//		}
		
//		Trainer t = session.get(Trainer.class, 2);
//		if(t==null) {
//				System.out.println("Trainer record not present");
//		}else {
//				System.out.println(t.getTid()+" "+t.getTname()+" "+t.getTech());
//				List<Student> listOfStd = 	t.getListOfStd();
//				System.out.println("Number of students "+listOfStd.size());
//				for(Student s :listOfStd) {
//					System.out.println(s);
//				}
//		}
		
		// Retrieve all recods from 
		
		Query<Trainer> qry= session.createQuery("select t from Trainer t");
		List<Trainer> listOfTrainer = qry.list();
		Iterator<Trainer> li = listOfTrainer.iterator();
		while(li.hasNext()) {
			Trainer t  = li.next();
			System.out.println(t.getTid()+" "+t.getTname()+" "+t.getTech());
			List<Student> listOfStd = 	t.getListOfStd();
			System.out.println("Number of students "+listOfStd.size());
			for(Student s :listOfStd) {
				System.out.println(s);
			}
		}
	}

}
