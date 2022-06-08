package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("first")
public class SampleController {

	@GetMapping(value = "sayHello")
	public String sayHello() {
		return "Welcome to First micro service say hello method";
	}
}
