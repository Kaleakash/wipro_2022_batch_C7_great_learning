package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

	
	@Autowired
	EmployeeDao employeeDao;
	
	
	public List<Employee> getAllEmployeeDetails() {
		return employeeDao.getAllEmloyeeDetails();
	}
	
	public String storeEmployee(Employee emp) {
		if(employeeDao.storeEmployee(emp)>0) {
			return "success stored";
		}else {
			return "didn't store";
		}
	}
}
