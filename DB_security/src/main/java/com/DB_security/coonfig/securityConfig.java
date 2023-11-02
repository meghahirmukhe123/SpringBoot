package com.DB_security.coonfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
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
				.password("test1")
				.roles("EMPLOYEE")
				.build();
		
		UserDetails u2= User.builder()
				.username("tanuja")
				.password("test12")
				.roles("MANAGER")
				.build();
		
		
		UserDetails u3= User.builder()
				.username("Anuja")
				.password("test123")
				.roles("ADMIN")
				.build();
		
		return new InMemoryUserDetailsManager(u1,u2,u3);
		
		
		
	}
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
	
	//restricting access based on role
	

   

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
       http.authorizeHttpRequests(configurer ->
                {
					try {
						configurer
						        .antMatchers(HttpMethod.GET, "/api/employee").hasRole("EMPLOYEE")
						        .antMatchers(HttpMethod.GET, "/api/employee/**").hasRole("EMPLOYEE")
						        .antMatchers(HttpMethod.POST, "/api/employee").hasRole("MANAGER")
						        .antMatchers(HttpMethod.PUT, "/api/employee").hasRole("MANAGER")
						        .antMatchers(HttpMethod.DELETE, "/api/employee/**").hasRole("ADMIN")
						        .anyRequest().authenticated()
						        .and()
						        .httpBasic()
						        .and()
						        .csrf().disable();
					} catch (Exception e) {
						// TODO Auto-generated catch block
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
