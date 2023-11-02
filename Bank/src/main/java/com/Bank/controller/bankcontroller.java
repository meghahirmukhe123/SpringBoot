package com.Bank.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.entity.mybank;
import com.Bank.repo.bankrepo;
import com.Bank.service.bankrequest;
import com.Bank.service.bankservice;

@RestController
public class bankcontroller {
	
	private final bankservice Bankservice;
	
	@Autowired
	public bankcontroller(bankservice Bankservice)
	{
		this.Bankservice=Bankservice;
	}
	
	//to add data in database
	
//	@PostMapping("/bank")
//	public ResponseEntity<mybank> createmybank(@RequestBody bankrequest Bankrequest)
//	{
//		mybank Mybank =Bankservice.savebank(Bankrequest.getBankId(), 
//				                       Bankrequest.getName(),
//				                       Bankrequest.getTotal(), 
//				                       Bankrequest.getRemove());
//		
//		return ResponseEntity.status(HttpStatus.CREATED).body(Mybank);
//	}
	
	
	//handling exception
	@PostMapping("/bank")
	public ResponseEntity<mybank> createmybank(@RequestBody bankrequest Bankrequest)
	{
		mybank Mybank =Bankservice.savebank(Bankrequest.getBankId(), 
				                       Bankrequest.getName(),
				                       Bankrequest.getTotal(), 
				                       Bankrequest.getRemove());
		
		if(Bankrequest.getRemove()> Bankrequest.getTotal())
		{
			throw new NoSuchElementException("out of limit");
		}
		else
		{
		return ResponseEntity.status(HttpStatus.CREATED).body(Mybank);
		}
	}
	
	
	
	
	
	
	
	
	
	

}
