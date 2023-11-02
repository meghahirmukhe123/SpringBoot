package com.Bank.exceptionhandler;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class mybankexception extends RuntimeException {

	public mybankexception(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
