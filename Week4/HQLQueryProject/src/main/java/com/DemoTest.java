package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
//		// retrieve all object 
//		//Query<Employee> qry = session.createQuery("select emp from Employee emp");
//		//Query<Employee> qry = session.createQuery("from Employee emp");
//		Query<Employee> qry = session.createQuery("from Employee");
//		List<Employee> listOfEmp = qry.list();
//		System.out.println("Number of records "+listOfEmp.size());
//		listOfEmp.forEach(e->System.out.println(e));
//		float salary  = 17000;
//		//retrieve all object with condition 
//		//Query<Employee> qry = session.createQuery("select emp from Employee emp where emp.salary > 17000");
//		Query<Employee> qry = session.createQuery("select emp from Employee emp where emp.salary > :sal");
//		qry.setParameter("sal", salary);
//		List<Employee> listOfEmp = qry.list();
//		System.out.println("Number of records "+listOfEmp.size());
//		listOfEmp.forEach(e->System.out.println(e));
		
//		// retrieve only one property partial property 
//		Query<String> qry = session.createQuery("select emp.name from Employee emp");
//		List<String> listOfEmp = qry.list();
//		System.out.println("Number of records "+listOfEmp.size());
//		listOfEmp.forEach(e->System.out.println(e));
		
		// retreive more than one column but partial object 
//		Query<Object[]> qry = session.createQuery("select emp.name,emp.salary from Employee emp");
//		List<Object[]> listOfEmp = qry.list();
//		System.out.println("Size "+listOfEmp.size());
//		listOfEmp.forEach(e->System.out.println("Name is "+e[0]+" Salary is "+e[1]));
		
		//Join with HQL 
//		Query<Object[]> qry = session.createQuery("select t.tname,t.tech,s.sname from Trainer t inner join Student s on t.tid=s.tsid");
//		List<Object[]> listOfEmp = qry.list();
//		System.out.println("Size "+listOfEmp.size());
//		listOfEmp.forEach(e->System.out.println("Name is "+e[0]+" Salary is "+e[1]));
		
		//Join with SQL
		Query<Object[]> qry = session.createSQLQuery("select t.tname,t.tech,s.sname from trainer t inner join student s on t.tid=s.tsid");
		List<Object[]> listOfEmp = qry.list();
		System.out.println("Size "+listOfEmp.size());
		listOfEmp.forEach(e->System.out.println("TName is "+e[0]+" Tech "+e[1]+" SName is "+e[2]));
	}

}





