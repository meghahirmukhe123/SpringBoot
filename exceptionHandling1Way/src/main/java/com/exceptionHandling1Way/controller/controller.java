package com.exceptionHandling1Way.controller;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exceptionHandling1Way.entity.emp;
import com.exceptionHandling1Way.handler.empexception;
import com.exceptionHandling1Way.repo.emprepo;

@RestController
public class controller {
	
	@Autowired
	private emprepo Emprepo;
	
	@PostMapping("/exp")
	public emp adddata(@RequestBody emp Emp)
	{
		return Emprepo.save(Emp);
	}
	
	@GetMapping("/exp")
	public Object getdata()
	{
		return Emprepo.findAll();
	}
	
	@GetMapping("/exp/empid/{empid}")
	public Object getmydata(@PathVariable String empid) throws empexception
	{
		Optional<emp> e= Emprepo.findById(empid);
		emp x=null;
		if(e.isPresent())
		{
			x=e.get();
		}else {
			throw new empexception();
		}
		return x;
	}

}
