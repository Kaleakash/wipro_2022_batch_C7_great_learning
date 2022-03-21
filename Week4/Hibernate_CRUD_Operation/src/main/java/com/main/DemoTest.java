package com.main;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		Employee emp = new Employee(103, "Ramesh", 13000);
		EmployeeService es = new EmployeeService();
		String res = es.storeEmloyee(emp);
		System.out.println(res);
	}

}
