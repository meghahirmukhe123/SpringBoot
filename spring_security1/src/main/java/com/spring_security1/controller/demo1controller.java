package com.spring_security1.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class demo1controller {
	List<String> l= new ArrayList<>();
	
	@GetMapping("/mydata")
	public List<String> getdata()
	{
		
		l.add("megha");
		l.add("anu");
		l.add("tanu");
		l.add("manu");
		l.add("rashi");
		
		return l;
		
	}
	
	
	
	
}
