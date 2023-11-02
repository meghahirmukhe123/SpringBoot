package com.Bank.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Bank.entity.mybank;
import com.Bank.exceptionhandler.mybankexception;
import com.Bank.repo.bankrepo;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

@Service
public class bankservice {
	
	
	private final bankrepo Bankrepo;
	
	@Autowired
	public bankservice (bankrepo Bankrepo)
	{
		this.Bankrepo=Bankrepo;
	}
	
	public mybank savebank(String bankid,String name,int total , int remove)
	{
		if(total>remove) {
		int remain=total-remove;
		mybank Mybank=new  mybank();
		Mybank.setBankid(bankid);
		Mybank.setName(name);
		Mybank.setTotal(total);
		Mybank.setRemove(remove);
		Mybank.setRemain(remain);
		
		return Bankrepo.save(Mybank);
		}
		
		else {
			throw new mybankexception("removal amount is greater than total");
		}
		
	}

	

	
}
