package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("second")
@RestController
public class SampleController {

	@GetMapping(value = "sayHello")
	public String sayHello() {
		return "Welcome to Spring micro servcie second application";
	}
}
