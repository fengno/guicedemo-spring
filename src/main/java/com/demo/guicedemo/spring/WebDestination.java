package com.demo.guicedemo.spring;

import org.demo.guicedemo.hellodemo.MyDestination;

import com.google.inject.Inject;
import com.google.inject.servlet.RequestScoped;

@RequestScoped
public class WebDestination implements MyDestination {
	private final StringBuilder sb;
	
	@Inject
	public WebDestination() {
		System.out.println(getClass() + " constructed.");
		this.sb = new StringBuilder();
	}

	@Override
	public void write(String string) {
		sb.append(string);
	}

	public String getResult() {
		return sb.toString();
	}
}
