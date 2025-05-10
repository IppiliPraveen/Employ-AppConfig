package com.employ.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.employ"})
public class EmployDomainObjectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployDomainObjectsApplication.class, args);
	}

}
