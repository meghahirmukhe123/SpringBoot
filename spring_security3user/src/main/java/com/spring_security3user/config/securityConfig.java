package com.spring_security3user.config;

import java.nio.file.attribute.UserDefinedFileAttributeView;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
public class securityConfig {
	
	@Bean
	public InMemoryUserDetailsManager userDetailsManager()
	{
		UserDetails megha = User.builder()
				.username("megha")
				.password("megha12345")
				.roles("EMPLOYEE")
				.build();
		
		UserDetails tanu = User.builder()
				.username("tanu")
				.password("tanu12345")
				.roles("EMPLOYEE")
				.build();
						
		
		UserDetails manu = User.builder()
				.username("manu")
				.password("manu12345")
				.roles("EMPLOYEE")
				.build();
		
		return new InMemoryUserDetailsManager(megha,tanu,manu);
						
						
	}
	@Bean
	public PasswordEncoder password()
	{
		return NoOpPasswordEncoder.getInstance();    //this is Deprecated
	}
	
	
	

}
