package com.spring_security2.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo2 {
	private List<String> n= Arrays.asList("megha","anu","ramesh","tanuja");
	
	
	
	@GetMapping("/demo2")
	public List<String> getdata()
	{
		return n;
	}
	
	

}
