package com;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EmployeeService {
	private List<Employee> listOfEmp = new ArrayList<>();
	
	public void addEmployee(Employee emp) {
		int flag  = 0;
		
			ListIterator<Employee> li = listOfEmp.listIterator();
			while(li.hasNext()) {
				Employee e = li.next();
				if(e.getId()==emp.getId()) {
					flag++;
				}
			}
		
		
		if(flag==0) {
			listOfEmp.add(emp);
			System.out.println("Record added..");
		}else{
			try {
			throw new EmployeeIdUniqueException("Id must be unqiue");
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public void displayAllRecord() {
		if(listOfEmp.size()==0) {
			System.out.println("Record not present");
		}else {
			ListIterator<Employee> li = listOfEmp.listIterator();
			while(li.hasNext()) {
				Employee e = li.next();
				System.out.println(e);
			}
		}
		
	}
}
