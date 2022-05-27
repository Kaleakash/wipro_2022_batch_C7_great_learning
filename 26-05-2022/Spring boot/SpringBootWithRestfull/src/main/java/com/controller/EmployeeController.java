package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Media;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

@RestController
public class EmployeeController {

	// http://localhost:8080/say 
	@RequestMapping(value = "say")
	public String sayHello() {
		return "Welcome to Spring boot with restful web service";
	}	
	// http://localhost:8080/html 
	@RequestMapping(value = "html",produces = MediaType.TEXT_HTML_VALUE)
	public String sayHtml() {
		return "<h2>Welcome to Spring boot with restful web service<h2>";
	}
	// http://localhost:8080/xml 
	@RequestMapping(value = "xml",produces = MediaType.TEXT_XML_VALUE)
	public String sayXml() {
		return "<h2>Welcome to Spring boot with restful web service<h2>";
	}
	// http://localhost:8080/text
	@RequestMapping(value = "text",produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayText() {
		return "<h2>Welcome to Spring boot with restful web service<h2>";
	}

	// http://localhost:8080/empInfo
	@RequestMapping(value = "empInfo",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee() {
		Employee emp = new Employee(1, "Ravi", 12000);
		return emp;
	}
	// http://localhost:8080/employees
	@RequestMapping(value = "employees",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployee() {
		List<Employee> listOfEmp =new ArrayList<Employee>();
		listOfEmp.add(new Employee(1, "Ravi", 10000));
		listOfEmp.add(new Employee(2, "Ramesh", 12000));
		listOfEmp.add(new Employee(3, "Ajay", 14000));
		return listOfEmp;
	}
	
	// http://localhost:8080/singleQuery?name=Ravi
	@RequestMapping(value = "singleQuery")
	public String singleQueryParam(@RequestParam("name") String name) {
		return "Welcome to Query param concept "+name;
	}
	// http://localhost:8080/multiQuery?name=Ravi&age=21
	@RequestMapping(value = "multiQuery")
	public String mutliQueryParam(@RequestParam("name") String name, @RequestParam("age") int age) {
		return "Welcome to Query param concept "+name+" age is "+age;
	}
		// http://localhost:8080/singlePath/Ravi
		@RequestMapping(value = "singlePath/{name}")
		public String singlePathParam(@PathVariable("name") String name) {
			return "Welcome to param param concept "+name;
		}	
		// http://localhost:8080/multiPath/Ravi/21
		@RequestMapping(value = "multiPath/{name}/{age}")
		public String multiPathParam(@PathVariable("name") String name, @PathVariable("age") int age) {
			return "Welcome to param param concept "+name+" Age is "+age;
		}
		
		// http://localhost:8080/postMethod
		@RequestMapping(value = "postMethod")
		public String testPost() {
			return "Welcome to Post method";
		}
		// http://localhost:8080/storeEmployee 
		
		@RequestMapping(value="storeEmployee",consumes = MediaType.APPLICATION_JSON_VALUE,
				method = RequestMethod.POST)
		public String storeEmployeeInfo(@RequestBody Employee emp) {
			System.out.println(emp);
			return "Welcome user to post method "+emp.getName();
		}
		// http://localhost:8080/updateEmployee 
		@RequestMapping(value="updateEmployee",consumes = MediaType.APPLICATION_JSON_VALUE,
				method = RequestMethod.PUT)
		public String updateEmployee(@RequestBody Employee emp) {
			System.out.println(emp);
			return "Welcoem user to put method "+emp.getName();
		}
		
		//http://localhost:8080/deleteEmployee/100 		
		@RequestMapping(value = "deleteEmployee/{id}",method = RequestMethod.DELETE)
		public String deleteEmployee(@PathVariable("id") int id) {
			return "Employee record deleted using id as "+id;
		}
}
