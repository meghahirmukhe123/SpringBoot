package com.spring_security6.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring_security6.entity.demo6;
import com.spring_security6.repo.demo6repo;

@RestController
public class demo6Controller {

	@Autowired
	private demo6repo Demo6repo;
	
	@PostMapping("/mydata")
	public demo6 adddata(@RequestBody demo6 Demo6)
	{
		return Demo6repo.save(Demo6);
	}
	
	@GetMapping("/mydata")
	public Object getdata()
	{
		return Demo6repo.findAll();
	}
}
