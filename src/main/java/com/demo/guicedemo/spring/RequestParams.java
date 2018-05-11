package com.demo.guicedemo.spring;

import com.google.inject.Singleton;

@Singleton
public class RequestParams {

	private String message;
	
	public RequestParams() {
		System.out.println(getClass() + " constructed.");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
