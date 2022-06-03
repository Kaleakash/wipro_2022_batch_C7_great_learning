package com.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public String sayHello(String name) {
		return "Welcome to Spring AOP with business method";
	}
}
