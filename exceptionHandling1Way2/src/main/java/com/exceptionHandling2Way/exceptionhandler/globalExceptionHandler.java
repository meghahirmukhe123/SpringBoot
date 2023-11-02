package com.exceptionHandling2Way.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class globalExceptionHandler {
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handlingexception(IllegalArgumentException ex)
	{
		String errormsg= ex.getMessage();
		if(errormsg.equals("wrong bookid"))
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("this book id is not present in database");
		}
		else if(errormsg.equals("wrong bookname"))
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("this book name is not present in database");
		}
		
		else if(errormsg.equals("wrong price"))
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("this book price's book is not present in database");
		}
		else {
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Internal Server error");
		
	}
	}
	
	
	
	

}
