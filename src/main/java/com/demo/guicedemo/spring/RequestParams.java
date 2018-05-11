package com.demo.guicedemo.spring;

import com.google.inject.servlet.RequestScoped;

@RequestScoped
public class RequestParams {

	private String name;
	
	public RequestParams() {
		System.out.println(getClass() + " constructed.");
	}

	public String getGreetingName() {
		return name;
	}

	public void setGreetingName(String message) {
		this.name = message;
	}
}
