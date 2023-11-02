package com.findByMethods.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.findByMethods.entity.emp;
import com.findByMethods.repo.emprepo;

@RestController
public class empcontroller {
	@Autowired
	private emprepo Emprepo;
	
	@PostMapping("/find")
	public emp adddata(@RequestBody emp Emp)
	{
		return Emprepo.save(Emp);
		
	}
	
	@GetMapping("/find")
	public Object getdata()
	{
		return Emprepo.findAll();
	}
	
	//find by empid
	@GetMapping("/find/empid/{empid}")
	public Object getdata(@PathVariable String empid)
	{
		return Emprepo.findById(empid);
	}
	
	//find By salory
	@GetMapping("/find/salory/{salory}")
	public List<emp> getdatabysalory(@PathVariable int salory)
	{
		return Emprepo.findBysalory(salory);
	}
	
	//find by department
	@GetMapping("/find/dept/{dept}")
	public List<emp> getdatabydept(@PathVariable String dept)
	{
		return Emprepo.findBydept(dept);
	}
	
		
	
	
	

}
