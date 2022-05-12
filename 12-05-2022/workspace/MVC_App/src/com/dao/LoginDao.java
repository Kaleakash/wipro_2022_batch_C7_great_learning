package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.Login;

import com.resource.DbResource;

public class LoginDao {

	
	public boolean checkLoginDetails(Login login) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from login where email = ? and password = ?");
			pstmt.setString(1, login.getEmail());
			pstmt.setString(2, login.getPassword());
			ResultSet rs = pstmt.executeQuery();
			return rs.next();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public int createLoginDetails(Login login) {
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into login values(?,?)");
			pstmt.setString(1, login.getEmail());
			pstmt.setString(2, login.getPassword());
			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
				System.out.println(e);
				return 0;
		}
	}
	
}
