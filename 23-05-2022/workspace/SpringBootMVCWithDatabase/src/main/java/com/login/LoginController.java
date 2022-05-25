package com.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Login;
import com.service.LoginService;

@Controller
public class LoginController {

	@RequestMapping(value = "/")
	public String openPage() {
		System.out.println("I Came here");
		return "login";
	}
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "/checkLogin",method = RequestMethod.POST)
	public String checkLogin(HttpServletRequest req, Login ll) {
		ll.setEmail(req.getParameter("email"));
		ll.setPassword(req.getParameter("password"));
		return loginService.checkLogin(ll);			// it may return success or failure
	}
}
