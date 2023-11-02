package com.user_DB.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "myuser")
public class Myuser {
	
	@Id
	private String username;
	private String password;
	private String roles;
	
	
	public Myuser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Myuser(String username, String password, String roles) {
		super();
		this.username = username;
		this.password = password;
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "Myuser [username=" + username + ", password=" + password + ", roles=" + roles + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}

}
