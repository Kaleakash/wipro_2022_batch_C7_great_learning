package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 				// <bean class="com.Employee">	</bean>	by default id name is employee
//@Component("emp")				// now id name is emp<bean class="com.Employee" id="emp"></bean>
public class Employee { 
@Value(value = "123")
private int id;
@Value(value="Ravi Kumar")
private String name;
@Value(value = "20000")
private float salary;
@Autowired
private Address add;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
}

}
