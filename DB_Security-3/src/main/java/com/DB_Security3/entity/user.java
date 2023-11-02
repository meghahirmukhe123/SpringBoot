package com.DB_Security3.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

@Document(collection = "users")

class xyz{
	private String username;
	private String password;
	private String roles;
	public xyz(String username,String password,String roles)
	{
		this.username=username;
		this.password=password;
		this.roles=roles;
	}
	
	
}
public class user {
	
	List<xyz> list= Arrays.asList(
			new xyz("megha", "megha123","emp"),
			new xyz("anu","anu123","manager"),
			new xyz("tanu","tanu123","admin")
			  );
	
	@GetMapping("/user")
	public List<xyz> getalldata()
	{
		return list;
	}
	
	

}
