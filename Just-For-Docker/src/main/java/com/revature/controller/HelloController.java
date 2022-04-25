package com.revature.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String sayHello() {
		return "I'm saying ello";
	}
	
	@GetMapping("/hola")
	public String sayHola() {
		return "I'm saying ello in spanish";
	}
	
}
