package com.spring_security3_3user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo3controller {

	
	List<Integer> list= new ArrayList<>();
	@GetMapping("/data")
	public List<Integer> getdata()
	{
		return list;
	}
}
