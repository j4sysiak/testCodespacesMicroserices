package com.example.carservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.carservice")
@EnableJpaRepositories(basePackages = "com.example.carservice")
//@RestController
public class CarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarServiceApplication.class, args);
	}

   /*
   	@GetMapping("/")
	public String hello() {
		return "Hello from GitHub Codespaces!";
	}
   */

}