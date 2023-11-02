package com.Bank.exceptionhandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class exceptionhandler {
	
	@ExceptionHandler(mybankexception.class)
	public ResponseEntity<String> handlingexception(mybankexception ex)
	{
		return ResponseEntity.badRequest().body(ex.getMessage());
	}

}
