package com.sudip.exceptionhandlingpoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sudip.exceptionhandlingpoc.exceptionhandler.NotFoundException;

@RestController
public class Controller {
	
	@GetMapping("/testExceptionHandling/{id}")
	public String getErrorMessage(@PathVariable int id) throws NotFoundException
	{
		if(id<1)
		{
			throw new NotFoundException("ID value less than 1");
		}
		else {
			return "Exception Handling POC working fine";
		}
			
	}

}
