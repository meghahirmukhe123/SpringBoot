package com.spring_security3user.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo3controller {
	
	private List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	@GetMapping("/user")
	public List<Integer> getdata()
	{
		return list;
	}

}
