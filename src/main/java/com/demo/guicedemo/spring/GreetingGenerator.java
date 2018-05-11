package com.demo.guicedemo.spring;

import com.google.inject.Inject;

public class GreetingGenerator {

	private final RequestParams params;
	
	@Inject
	public GreetingGenerator(RequestParams params) {
		this.params = params;
	}
	
	public String getGreetingMessage() {
		return "Hello " + params.getGreetingName();
	}
}
