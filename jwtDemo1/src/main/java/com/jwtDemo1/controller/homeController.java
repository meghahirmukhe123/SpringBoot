package com.jwtDemo1.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {
	
	@GetMapping("/home")
	public String jwtlearn()
	{
		return "SHREE SWAMI SAMARTH";
	}
	
	//to get user name of current user
	
		@GetMapping("/user")
		public String currentUser(Principal p)
		{
			return p.getName();
		}

}
