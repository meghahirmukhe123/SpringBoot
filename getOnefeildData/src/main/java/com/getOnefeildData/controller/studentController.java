package com.getOnefeildData.controller;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.getOnefeildData.entity.student;
import com.getOnefeildData.repo.studentrepo;

@RestController
public class studentController {
	
	@Autowired
	private studentrepo sturepo;
	
	@PostMapping("/onefeild")
	public student adddata(@RequestBody student stu)
	{
		return sturepo.save(stu);
	}
	
	@GetMapping("/onefeild")
	public Object getdata()
	{
		return sturepo.findAll();
	}
	
	//get only names from database
	@GetMapping("/onefeild/name")
	public List<String> getonlyname()
	{
		List<student> s= sturepo.findAll();
		return s.stream().map(x->x.getName()).collect(Collectors.toList());
		
	}
	
	//get name and std
	@GetMapping("/onefeild/name/std")
	public List<List<Object>> getmydata()
	{
		List<student> l= sturepo.findAll();
		List<List<Object>> list=new ArrayList<>();
		for(student s:l)
		{
			List<Object> dataList= new ArrayList<>();
			dataList.add(s.getName());
			dataList.add(s.getStd());
			list.add(dataList);
		}
		
		return list;
	}

}
