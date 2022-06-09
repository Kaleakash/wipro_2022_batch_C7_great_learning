package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("simple")
@RestController
public class SimpleController {

	@GetMapping(value = "say")
	public String sayHello() {
		return "Welcome to Simple Spring boot security";
	}
}
