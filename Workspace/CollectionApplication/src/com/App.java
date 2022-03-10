package com;

import java.util.Scanner;
class MyOperation implements Runnable{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String tname = t.getName();
		System.out.println("name of the thread "+tname);
		if(tname.equals("Add")) {
				System.out.println("Visitor");	
		}
		if(tname.equals("Display")) {
			System.out.println("User");
		}
		Scanner sc = new Scanner(System.in);
//		EmployeeService es = new EmployeeService();
//		int id;
//		String name;
//		float salary;
//		String con="";
//		do {
//				System.out.println("1:Add 2: Display");
//				System.out.println("Enter your choice");
//				int choice = sc.nextInt();
//				switch(choice) {
//				case 1: System.out.println("Enter the id");
//						id = sc.nextInt();
//						System.out.println("Enter the name");
//						name = sc.next();
//						System.out.println("Enter the salary");
//						salary = sc.nextFloat();
//						Employee emp = new Employee(id, name, salary);
//							
//							es.addEmployee(emp);
//						
//						break;
//				case 2: 
//						
//							es.displayAllRecord();
//						
//						break;
//				default:System.out.println("Wrong choice");
//				      break;
//				}
//			
//			System.out.println("do you want to continue?");
//			con = sc.next();
//		} while (con.equals("y"));
		
		
	}
}
public class App {
	public static void main(String[] args) {
		MyOperation op = new MyOperation();
		Thread t1 = new Thread(op);
		Thread t2 = new Thread(op);
		t1.setName("Add");
		t2.setName("Display");
		t1.start();
		t2.start();
		
	}

}
