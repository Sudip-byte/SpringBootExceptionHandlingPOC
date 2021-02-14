package com.sudip.exceptionhandlingpoc.exceptionhandler;

public class NotFoundException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public NotFoundException(String message)
	{
		this.msg = message;
	}
	
	public String getCustomErrorMessage()
	{
		return msg;
	}

}
