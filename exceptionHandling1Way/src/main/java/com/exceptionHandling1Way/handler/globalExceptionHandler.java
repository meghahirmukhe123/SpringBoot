package com.exceptionHandling1Way.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class globalExceptionHandler {
	
	@ExceptionHandler(value=empexception.class)

	public ResponseEntity<Object> handlernotfound()
	{
		return new ResponseEntity<>("this id is not available",HttpStatus.NOT_FOUND);
		
	}

	

}
