package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // <1>
@RestController // <3>
public class ContainerizationApplication {
	public static void main(String[] args) { // <2>
		SpringApplication.run(ContainerizationApplication.class);
	}

	@GetMapping("/hello") // <4>
	public String helloWorld() {
		return "hello containerization!";
	}
}
