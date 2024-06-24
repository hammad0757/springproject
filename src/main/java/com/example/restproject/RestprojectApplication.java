package com.example.restproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestprojectApplication {

	@GetMapping("/message")
	public String getString() {
		return "Message from API";
	}

	public static void main(String[] args) {
		SpringApplication.run(RestprojectApplication.class, args);
	}

}
