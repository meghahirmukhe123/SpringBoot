package com.user_DB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user_DB.entity.Data;
import com.user_DB.repo.Datarepo;

@RestController
public class Datacontroller {
	
	@Autowired
	private Datarepo Datarepo;
	
	@PostMapping("/add")
	public Data adddata(@RequestBody Data Data)
	{
		return Datarepo.save(Data);
	}

	
	@GetMapping("/get")
	public Object getdata()
	{
		return Datarepo.findAll();
	}
	
	

	@GetMapping("/get/id/{id}")
	public Object getdatabyid(@PathVariable String id)
	{
		return Datarepo.findById(id);
	}
	
	

	@PutMapping("/put/id/{id}")
	public String update(@RequestBody Data Data,@PathVariable String id)
	{
		 Datarepo.save(Data);
		 return "updated seccessfully";
		 
	}
	
	
	@DeleteMapping("/delete/id/{id}")
	public String delete(@PathVariable String id)
	{
		 Datarepo.deleteById(id);
		 return "deleted seccessfully";
		 
	}
	
	
}
