package com.example.swaggerexample.controller;

import java.io.IOException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class SwaggerController {

	@GetMapping
	public void swagger(HttpServletResponse response) throws IOException {
		response.sendRedirect("/swagger-ui.html");
	}
}
