package com.esgi.notification.team.consul.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceDiscoveryApplication {
	
	@GetMapping("/")
	public String getMessage() {
		return "The notification service is up and running";
	}

	@GetMapping("/health")
	public ResponseEntity<String> healthCheck() {
		String message = "told consul that we are healthy";
		System.out.println(message);
		return new ResponseEntity<>(message, HttpStatus.OK);
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryApplication.class, args);
	}

}
