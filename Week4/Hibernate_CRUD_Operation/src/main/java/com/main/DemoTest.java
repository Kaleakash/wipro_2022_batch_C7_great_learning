package com.main;

import java.util.Scanner;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService es = new EmployeeService();
		int choice;
		int id;
		String name;
		float salary;
		String result;
		String con;
		do {
			System.out.println("1:Add Employee");
			choice = sc.nextInt();
			switch (choice) {
			case 1:	System.out.println("Enter the id");
			 			id = sc.nextInt();
			 			System.out.println("Enter the name");
			 			name = sc.next();
			 			System.out.println("Enter the salary");
			 			salary = sc.nextFloat();
			 			Employee emp1 = new Employee(id, name, salary);
			 			result = es.storeEmloyee(emp1);
			 			System.out.println(result);
			 			break;

			default:
				break;
			}
			System.out.println("Do you want to continue ?");
			con =sc.next();
		} while (con.equals("y"));
	}

}
