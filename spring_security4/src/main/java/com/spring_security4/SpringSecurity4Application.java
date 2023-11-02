package com.spring_security4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//override default username and password way 2
//Made changes in application.properties
@SpringBootApplication
public class SpringSecurity4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurity4Application.class, args);
	}

}
