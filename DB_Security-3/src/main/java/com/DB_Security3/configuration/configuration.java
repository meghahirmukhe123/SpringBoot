package com.DB_Security3.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

@Configuration
public class configuration {
	
	

	

	@Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
	
	//giving authority acc to roles
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
	{
		http.authorizeHttpRequests(Configurer ->
		
		{
			try {
				Configurer
				.requestMatchers(HttpMethod.GET,"/ssm").hasRole("emp")
				.requestMatchers(HttpMethod.GET,"/ssm/**").hasRole("emp")
				.requestMatchers(HttpMethod.POST,"/ssm").hasRole("manager")
				.requestMatchers(HttpMethod.PUT,"/ssm/empid/**").hasRole("manager")
				.requestMatchers(HttpMethod.DELETE,"/ssm/empid/**").hasRole("admin")
				.anyRequest().authenticated()
				.and()
				.httpBasic()
				.and()
				.csrf()
				.disable();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		});
		

        // Use HTTP basic authentication
        http.httpBasic(Customizer.withDefaults());

        // Disable CSRF
        http.csrf(csrf -> csrf.disable());

        return http.build();
		
	}

}
