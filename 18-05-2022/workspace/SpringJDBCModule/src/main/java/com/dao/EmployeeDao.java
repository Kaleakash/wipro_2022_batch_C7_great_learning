package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.bean.Employee;
@Repository
public class EmployeeDao {

//	@Autowired
//	DataSource ds;
//	
//	public List<Employee> getAllEmloyeeDetails() {
//		List<Employee> listOfEmp = new ArrayList<>();
//		try {
//			Connection con = ds.getConnection();
//			PreparedStatement pstmt = con.prepareStatement("select * from employee");
//			ResultSet rs = pstmt.executeQuery();
//			while(rs.next()) {
//				Employee emp = new Employee();
//				emp.setId(rs.getInt(1));
//				emp.setName(rs.getString(2));
//				emp.setSalary(rs.getFloat(3));
//				listOfEmp.add(emp);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}
//		return listOfEmp;
//	}

	public List<Employee> getAllEmloyeeDetails() {
		try {
			return jdbcTemplate.query("select * from employee", new MyRowMapper());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	
//	public int storeEmployee(Employee emp) {
//		
//		try {
//			Connection con = ds.getConnection();
//			PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
//			pstmt.setInt(1, emp.getId());
//			pstmt.setString(2, emp.getName());
//			pstmt.setFloat(3, emp.getSalary());
//			return pstmt.executeUpdate();
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e);
//			return 0;
//		}
//
//	}
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int storeEmployee(Employee emp) {
		try {
			return jdbcTemplate.update("insert into employee values(?,?,?)", emp.getId(),emp.getName(),emp.getSalary());
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
}
// this code is responsible to convert query to java bean object. 
class MyRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setSalary(rs.getFloat(3));
		return emp;
	}
	
}