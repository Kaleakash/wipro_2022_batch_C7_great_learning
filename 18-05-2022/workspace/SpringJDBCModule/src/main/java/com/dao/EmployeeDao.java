package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bean.Employee;
@Repository
public class EmployeeDao {

	@Autowired
	DataSource ds;
	
	public List<Employee> getAllEmloyeeDetails() {
		List<Employee> listOfEmp = new ArrayList<>();
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from employee");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getFloat(3));
				listOfEmp.add(emp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return listOfEmp;
	}
}
