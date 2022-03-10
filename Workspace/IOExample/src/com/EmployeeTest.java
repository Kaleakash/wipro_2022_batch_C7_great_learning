package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
//		Employee emp = new Employee(100, "Ravi", 12000);
//		System.out.println(emp);
//		FileOutputStream fos = new FileOutputStream("emp.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(emp);
//		System.out.println("Object serialization done successfully");
		
		FileInputStream fis = new FileInputStream("emp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object oo = ois.readObject();
		Employee e = (Employee)oo;// down level type casting 
		System.out.println(e);
		System.out.println("Object De-serialization done successfully");
	}

}
