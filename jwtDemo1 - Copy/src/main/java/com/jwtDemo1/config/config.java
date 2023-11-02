package com.jwtDemo1.config;

import java.security.Principal;

import org.apache.catalina.startup.HomesUserDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.method.annotation.PrincipalMethodArgumentResolver;

@Configuration
public class config 
{
	
	@Bean
	public UserDetailsService userDetailsService()
	{
		UserDetails userDetails=
				User.builder()
				.username("megha")
				.password(passwordEncoder().encode("test123"))
				.roles("admin")
				.build();
		return new InMemoryUserDetailsManager(userDetails);
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	 @Bean
	 public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception 
	 {
	        return builder.getAuthenticationManager();
	 }
	
	
	

}
