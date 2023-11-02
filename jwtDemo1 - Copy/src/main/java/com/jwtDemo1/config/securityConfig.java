package com.jwtDemo1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import com.jwtDemo1.security.jwtAuthenticationEntry;
import com.jwtDemo1.security.jwtAuthenticationFilter;

@Configuration
public class securityConfig {

	   @Autowired
	    private jwtAuthenticationEntry point;
	   
	   
	    @Autowired
	    private jwtAuthenticationFilter filter;
	    
	    
	    @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	    
	    {
	    	
	    	//configuration
	    	
	    	http.csrf(csrf -> csrf.disable())
	    	.cors(cors -> cors.disable())
	    	.authorizeHttpRequests(auth -> auth.requestMatchers("/home/**")
	    			
	    			.authenticated()
	    			.requestMatchers("/auth/login")
	    			.permitAll()
	    			.anyRequest()
	    			.authenticated())
	    	.exceptionHandling(ex -> ex.authenticationEntryPoint(point))
	    	.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
	  
	    	;
	    	
	    	
	    	
	    	http.addFilterBefore(filter,UsernamePasswordAuthenticationFilter.class );
	    	return http.build();
	    }

}
