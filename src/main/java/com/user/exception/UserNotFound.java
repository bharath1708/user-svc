package com.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class UserNotFound extends Exception {

	public UserNotFound() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserNotFound(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
