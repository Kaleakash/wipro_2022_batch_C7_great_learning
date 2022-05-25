package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Login;

@Repository
public class LoginDao {

	@Autowired
	DataSource ds;
	
	public boolean checkLoginDetails(Login login) {
		try {
		Connection con = ds.getConnection();
		PreparedStatement psmt = con.prepareStatement("select * from login where email = ? and password = ?");
		psmt.setString(1, login.getEmail());
		psmt.setString(2, login.getPassword());
		ResultSet rs = psmt.executeQuery();
		if(rs.next()) {
			return true;
		}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
}
