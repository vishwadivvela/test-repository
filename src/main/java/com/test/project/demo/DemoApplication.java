package com.test.project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
 
	// without main method code can be compiled but cannot be executed
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
