package com.example.swaggerexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

	@GetMapping("/cookies")
	public String getCookies() {
		return "Free Cookies";
	}
}
