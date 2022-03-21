package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.google.protobuf.Empty;

public class DemoTest {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7", "root", "root@123");
		System.out.println("Conneted successfully");
		// Insert query 
		
//	PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
//	System.out.println("Enter the id");
//	int id = sc.nextInt();
//	System.out.println("Enter the name");
//	String name = sc.next();
//	System.out.println("Enter the salary");
//	float salary = sc.nextFloat();
//	pstmt.setInt(1, id);
//	pstmt.setString(2, name);
//	pstmt.setFloat(3, salary);
//	int res = pstmt.executeUpdate();			// DML Operation 
//	if(res>0) {
//		System.out.println("Record inserted successfully");
//	}
//		// update query 
//		PreparedStatement pstmt = con.prepareStatement("update employee set salary = ? where id =?");
//		System.out.println("Enter the id");
//		int id = sc.nextInt();
//		System.out.println("Enter the salary");
//		float salary = sc.nextFloat();
//		pstmt.setFloat(1, salary);
//		pstmt.setInt(2, id);
//		int res = pstmt.executeUpdate();			// DML Operation 
//		if(res>0) {
//			System.out.println("Record updated successfully");
//		}else {
//			System.out.println("Record didn't update");
//		}
		
		// retrieve 
		PreparedStatement pstmt = con.prepareStatement("select * from employee");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.println("Id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
		}
		
	}

}


