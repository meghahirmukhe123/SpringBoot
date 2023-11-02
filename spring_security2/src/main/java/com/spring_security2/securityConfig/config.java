package com.spring_security2.securityConfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration

public class config {
	
	//we are overriding default username and password
	
	@Bean   //UserDetailsService is predifined thats why we used Bean here
	public UserDetailsService userdetailservice()
	{
		//first way
		// InMemoryUserDetailsManager ud = new InMemoryUserDetailsManager();
				 
		//we can write above line as it is or another way is
		//second way
		
		var ud= new InMemoryUserDetailsManager();
		
		//to override username and password
		
		var user= User.builder()
				.username("Megha")
				.password("megha12345")
				.authorities("read")
				.build();
		
		ud.createUser(user);
		return ud;
	}
	
	@Bean
	public PasswordEncoder password()
	{
		return NoOpPasswordEncoder.getInstance();    //this is Deprecated
	}
	
	
	

}
