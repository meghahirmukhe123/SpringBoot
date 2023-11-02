package com.exceptionHandling2Way.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exceptionHandling2Way.entity.book;

import com.exceptionHandling2Way.repo.bookrepo;


@RestController
public class bookcontroller {
	@Autowired
	private bookrepo Bookrepo;
	
	@PostMapping("/exp")
	public book adddata(@RequestBody book Book)
	{
		return Bookrepo.save(Book);
	}
	
	@GetMapping("/exp")
	public Object getdata()
	{
		return Bookrepo.findAll();
	}
	
	@GetMapping("/exp/bookid/{bookid}")
	public Object getmydata(@PathVariable String bookid)
	{
		Optional<book> l= Bookrepo.findById(bookid);
		if(l.isEmpty())
		{
			throw new IllegalArgumentException("wrong bookid");
		}
		
		return l.get();
		
	}
	
	
	@GetMapping("/exp/bookname/{bookname}")
	public Object getmydatanyname(@PathVariable String bookname) 
	{
		List<book> l2= Bookrepo.findByname(bookname);
		if(l2.isEmpty())
		{
			throw new IllegalArgumentException("wrong bookname");
		}
		
		return l2;
		
	}
	
	
	 
	
	 
	
	 
	 

}
