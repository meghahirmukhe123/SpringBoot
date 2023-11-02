package com.spring_security5.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo4controller {
	private final List<String> l= Arrays.asList("a","b","c","d","e");
	
	@GetMapping("/api/employee")
	public List<String> getdata()
	{
		return l;
	}
	
	@GetMapping("/api/employee/id")
	public String getdata1()
	{
		return "ID";
	}
	@DeleteMapping("/api/employee/myid")
	public String deletedata1()
	{
		return "admin has deleted the id";
	}
	
	
	

}
