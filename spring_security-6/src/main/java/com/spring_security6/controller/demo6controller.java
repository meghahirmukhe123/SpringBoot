package com.spring_security6.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_security6.entity.demo6;
import com.spring_security6.repo.demo6repo;

@RestController
@RequestMapping("/api/users")
public class demo6controller {
	
	 private List<demo6> users = new ArrayList<>();

	    @PostMapping
	    @PreAuthorize("hasRole('ADMIN')")
	    public void addUser(@RequestBody demo6 user) {
	        users.add(user);
	    }

	    @GetMapping
	    public List<demo6> getAllUsers() {
	        return users;
	    }
	

}
