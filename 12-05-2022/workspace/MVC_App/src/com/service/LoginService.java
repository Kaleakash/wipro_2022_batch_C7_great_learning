package com.service;

import com.bean.Login;
import com.dao.LoginDao;

public class LoginService {

	LoginDao ld = new LoginDao();
	
	public String checkLoginDetails(Login login) {
		if(ld.checkLoginDetails(login)) {
			return "success";
		}else {
			return "failure";
		}
	}
	
	
	public String createLoginDetals(Login login) {
		if(ld.createLoginDetails(login)>0) {
			return "Account created successfully";
		}else {
			return "Account didn't create";
		}
	}
}
