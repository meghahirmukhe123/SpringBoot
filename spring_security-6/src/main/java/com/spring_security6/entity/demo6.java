package com.spring_security6.entity;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.UserDetailsManagerConfigurer;

public class demo6 {
	
	
	private long id;
	private String name;
	private int num;
	
	
	public demo6(long id, String name, int num) {
		super();
		this.id = id;
		this.name = name;
		this.num = num;
	}
	
	
	public demo6() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "demo6 [id=" + id + ", name=" + name + ", num=" + num + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}


	


	public static UserDetailsManagerConfigurer<AuthenticationManagerBuilder, InMemoryUserDetailsManagerConfigurer<AuthenticationManagerBuilder>>.UserDetailsBuilder withDefaultPasswordEncoder() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
