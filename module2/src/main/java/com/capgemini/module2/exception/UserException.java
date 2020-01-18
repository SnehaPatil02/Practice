package com.capgemini.module2.exception;

public class UserException extends RuntimeException {
	
	String msg;
	
	public UserException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}
	

}
