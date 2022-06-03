package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.service.EmployeeService;

@SpringBootApplication(scanBasePackages = "com")
@EnableAspectJAutoProxy(exposeProxy = true)	// This is use to enable advice class 
public class SpringBootWithAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithAopApplication.class, args);
		System.out.println("Server up!");
	}

}
