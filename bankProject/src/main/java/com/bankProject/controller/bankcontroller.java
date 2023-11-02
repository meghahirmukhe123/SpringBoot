package com.bankProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bankProject.entity.bank;
import com.bankProject.repo.bankrepo;
import com.bankProject.service.bankservice;

public class bankcontroller {

	@Autowired
	
	private bankservice Bankservice;
	
	public bankcontroller(bankservice Bankservice)
	{
		this.Bankservice=Bankservice;
	}
	

	@PostMapping("/bank")
	
	 public ResponseEntity<bank> createmybank(@RequestBody  bank Bank) {
        bank createmybank = Bankservice.createmybank(Bank);
        return ResponseEntity.status(HttpStatus.CREATED).body(createmybank);
    }
	 

		

	
}
