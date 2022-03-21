package com.service;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {

		public String storeEmloyee(Employee emp) {
			
			if(emp.getSalary()<12000) {
				return "Salary must be >12000";
			}else {
				EmployeeDao ed = new EmployeeDao();
				if(ed.storeEmployee(emp)>0) {
					return "REcord stored successfully";
				}else {
					return "REcord didn't store";
				}
			}
		}

}
