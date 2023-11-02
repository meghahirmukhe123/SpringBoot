package com.DB_Security3.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DB_Security3.entity.emp;
import com.DB_Security3.repo.emprepo;
;

@RestController
@RequestMapping("/api/data")
public class empcontroller {

	@Autowired
	private emprepo Emprepo;
	
	@PostMapping("/ssm")
	public emp adddata(@RequestBody emp Emp)
	{
		return Emprepo.save(Emp);
	}
	
	@GetMapping("/ssm")
	public Object getdata()
	{
		return Emprepo.findAll();
	}
	
	
	@GetMapping("/ssm/empid/{empid}")
	public Object getbyid(@PathVariable String empid)
	{
		return Emprepo.findById(empid);
	}
	
	@PutMapping("/ssm/empid/{empid}")
	public String updatedata(@RequestBody emp Emp,@PathVariable String empid)
	{
		Emprepo.save(Emp);
		return "database updated successfulyy";
	}
	
	@DeleteMapping("/ssm/empid/{empid}")
	public Object deletebyid(@PathVariable String stuid)
	{
		Emprepo.deleteById(stuid);
		return stuid+" -record is deleted";
	}
	
	
	
	
}
