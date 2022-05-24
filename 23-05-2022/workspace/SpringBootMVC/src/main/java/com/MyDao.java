package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class MyDao {

	@Autowired
	DataSource ds;
	
	public boolean checkUser(Login ll) {
		try {
			Connection con  = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from login where email = ? and password = ?");
			pstmt.setString(1, ll.getEmail());
			pstmt.setString(2, ll.getPassword());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return false;
	}
}
