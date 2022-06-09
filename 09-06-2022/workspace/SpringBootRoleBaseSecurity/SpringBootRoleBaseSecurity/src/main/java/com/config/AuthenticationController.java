package com.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthenticationController {
	@GetMapping(value = "user/say")
	public String normalUser() {
		return "Welcome to Normal User";
	}
	@GetMapping(value = "admin/say")
	public String adminUser() {
		return "Welcoem to Admin user";
	}
	@GetMapping(value = "say")
	public String normal() {
		return "Welcome without authentication";
	}
}
