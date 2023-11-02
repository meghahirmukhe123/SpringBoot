package com.user_DB.controller;

import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usercontroller {
	
	@Id
	private String username;
	private String password;
	private String roles;

}
