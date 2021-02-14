package com.sudip.exceptionhandlingpoc.exceptionhandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	 @ResponseBody
	 @ExceptionHandler(value = NotFoundException.class)
	 public String handleException(NotFoundException exp)
	 {
		return exp.getCustomErrorMessage();
		 
	 }

}
