package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.dao.LoginDao;

@Service
public class LoginService {

	@Autowired
	LoginDao loginDao;
	
	public String checkLogin(Login login) {
		if(loginDao.checkLoginDetails(login)) {
			return "success";
		}else {
			return "failure";
		}
	}
}
