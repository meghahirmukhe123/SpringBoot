package com.spring_security5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//restrict access based on role.
//read all for=employee
//create and update for manager
//delete for admin
@SpringBootApplication
public class SpringSecurity5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurity5Application.class, args);
	}

}
