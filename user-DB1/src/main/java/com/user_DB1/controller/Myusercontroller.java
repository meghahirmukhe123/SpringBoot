package com.user_DB1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user_DB1.entity.Myuser;
import com.user_DB1.repo.Myuserrepo;

@RestController
public class Myusercontroller {
	@Autowired
	private Myuserrepo Userrepo;
	
	@PostMapping("/users")
	public Myuser adddata(@RequestBody Myuser User)

	{
		return Userrepo.save(User);
	}
	
	
	
	@GetMapping("/user")
	public Object getdata()
	{
		return Userrepo.findAll();
	}
}
