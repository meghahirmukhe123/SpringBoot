package com.user_DB.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.user_DB.entity.Myuser;
import com.user_DB.repo.Myuserrepo;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private Myuserrepo myuserrepo;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests()
		.antMatchers("/api/data").hasRole("user")
		.and()
		.httpBasic();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.userDetailsService(Username ->
		{
			Myuser myuser=myuserrepo.findByusername(Username);
			if(myuser!=null)
			{
				return org.springframework.security.core.userdetails.User
                        .withUsername(myuser.getUsername())
                        .password(myuser.getPassword())
                        .roles(myuser.getRoles())
                        .build();
            } else {
                throw new UsernameNotFoundException("User not found");
            }
        });
			
		
	}
	
	
	@Bean
	public PasswordEncoder password()
	{
		return NoOpPasswordEncoder.getInstance();    //this is Deprecated
	}
	
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
       http.authorizeHttpRequests(configurer ->
                {
					try {
						configurer
						        .antMatchers(HttpMethod.GET, "/get").hasRole("EMPLOYEE")
						        .antMatchers(HttpMethod.GET, "/get/id/**").hasRole("EMPLOYEE")
						        .antMatchers(HttpMethod.POST, "/post").hasRole("MANAGER")
						        .antMatchers(HttpMethod.PUT, "/put/id/**").hasRole("MANAGER")
						        .antMatchers(HttpMethod.DELETE, "/delete/id/**").hasRole("ADMIN")
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
