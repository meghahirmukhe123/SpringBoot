package com.DB_Security1.config;

import org.springframework.cache.annotation.CachingConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class securityConfig {
	
	@Bean
	public InMemoryUserDetailsManager userDetailsManager()
	{
		UserDetails u1= User.builder()
				.username("megha")
				.password("megha123")
				.roles("emp")
				.build();
		
		UserDetails u2= User.builder()
				.username("tanu")
				.password("tanu123")
				.roles("emp","manager")
				.build();
		
		UserDetails u3= User.builder()
				.username("anu")
				.password("anu123")
				.roles("emp","manager","admin")
				.build();
		
		return new InMemoryUserDetailsManager(u1,u2,u3);
	}
	
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
				.requestMatchers(HttpMethod.GET,"/mydata").hasRole("emp")
				.requestMatchers(HttpMethod.GET,"/mydata/**").hasRole("emp")
				.requestMatchers(HttpMethod.POST,"/mydata").hasRole("manager")
				.requestMatchers(HttpMethod.PUT,"/mydata/stuid/**").hasRole("manager")
				.requestMatchers(HttpMethod.DELETE,"/mydata/stuid/**").hasRole("admin")
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
