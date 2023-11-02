package com.DB_security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DB_security.entity.demo;
import com.DB_security.repo.demorepo;

@RestController
public class democontroller {
	
	@Autowired
	private demorepo Demorepo;
	
	@PostMapping("/api/employee")
	public demo add(@RequestBody demo Demo)
	{
		return Demorepo.save(Demo);
	}
	
	
	@GetMapping("/api/employee")
	public Object getdata()
	{
		return Demorepo.findAll();
	}
	

}
