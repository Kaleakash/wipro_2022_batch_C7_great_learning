package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("docker")
public class SimpleController {

	@GetMapping(value = "sayHello")
	public String sayHello() {
		return "Welcome to Spring boot with Docker by Akash Kale";
	}
}
