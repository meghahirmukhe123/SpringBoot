package com.bankProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankProject.entity.bank;
import com.bankProject.repo.bankrepo;

@Service
public class bankservice {
	
	private final bankrepo Bankrepo;
	
	@Autowired
	public bankservice(bankrepo Bankrepo)
	{
		this.Bankrepo=Bankrepo;
	}
	
	public bank createmybank(bank Bank)
	{
		int remain=bank.getTotal()-bank.getRemove();
		bank.setRemain(remain);
		return Bankrepo.save(Bank);
	}
	
	public List<bank> getalldata()
	
	{
		return Bankrepo.findAll();
	}

}
