package com.demo.guicedemo.spring;

import com.demo.guicedemo.MyDestination;
import com.google.inject.Singleton;

@Singleton
public class WebDestination implements MyDestination {
	private StringBuilder sb = new StringBuilder();
	
	public WebDestination() {
		System.out.println(getClass() + " constructed.");
	}

	@Override
	public void write(String string) {
		sb.append(string);
	}

	public String getResult() {
		return sb.toString();
	}
}
