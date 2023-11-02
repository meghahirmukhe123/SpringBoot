package com.DB_Security1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DB_Security1.entity.stu;
import com.DB_Security1.repo.sturepo;

@RestController
public class stucontroller {
	
	@Autowired
	private sturepo Sturepo;
	
	@PostMapping("/mydata")
	public stu adddata(@RequestBody stu Stu)
	{
		return Sturepo.save(Stu);
	}

	@GetMapping("/mydata")
	public Object getdata()
	{
		return Sturepo.findAll();
	}
	
	//getmapping by id
	
	@GetMapping("/mydata/{stuid}")
	public Object getdata(@PathVariable String stuid)
	{
		return Sturepo.findById(stuid);
	}
	
	
	@PutMapping("/mydata/stuid/{stuid}")
	public String updatemydata(@RequestBody stu Stu, @PathVariable String stuid)
	{
		 Sturepo.save(Stu);
		 return "record added successfully!!";
		
	}
	
	
	@DeleteMapping("/mydata/stuid/{stuid}")
	public Object deletedata(@PathVariable String stuid)
	{
		Sturepo.deleteById(stuid);
		return stuid+" -this id record has deleted successfully";
	}
	
}
