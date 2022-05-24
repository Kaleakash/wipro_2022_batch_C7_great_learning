package com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/")
	public String sayHello() {
		return "index";						// index
	}
	
	@RequestMapping(value = "/checkUser",method = RequestMethod.POST)
	public String checkUser(HttpServletRequest req) {
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		if(email.equals("raj@gmail.com") && pass.equals("123")) {
			return "success";
		}else {
			return "failure";
		}
	}
}
