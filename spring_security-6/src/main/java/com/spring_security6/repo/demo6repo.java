package com.spring_security6.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring_security6.entity.demo6;

@Repository
public class demo6repo {
	
	private List<demo6> users=new ArrayList<>();
	
	
	//to add save method
	public void save(demo6 user)
	{
		users.add(user);
	}
	
	//to get data
	public List<demo6> findAll()
	{
		return users;
	}
	
	

}
