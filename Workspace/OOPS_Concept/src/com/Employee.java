package com;

public class Employee {
private String name;
private float salary;
void display() {
	System.out.println("name is "+name);
	System.out.println("salary is "+salary);
}
//void setValue(String name1, float salary1) {
//	name = name1;
//	//salary = salary1;
//	if(salary1<0) {
//		salary = 8000;
//	}else {
//		salary = salary1;
//	}
//}
void setValue(String name, float salary) {
		this.name = name;
		this.salary = salary;
}
}
