package com.example.azure.springazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {
	
	@GetMapping("/message")
	public String message() {
		return "Welcome o Azure";
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}

}
