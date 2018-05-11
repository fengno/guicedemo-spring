package com.demo.guicedemo.spring;

import org.demo.guicedemo.hellodemo.MyDestination;

import com.google.inject.Inject;
import com.google.inject.servlet.RequestScoped;

@RequestScoped
public class WebDestination implements MyDestination {
	private final StringBuilder sb;
	private final SampleDao dao;
	
	@Inject
	public WebDestination(SampleDao dao) {
		System.out.println(getClass() + " constructed.");
		this.dao = dao;
		this.sb = new StringBuilder();
	}

	@Override
	public void write(String string) {
		sb.append(string);
		dao.save(string);
	}

	public String getResult() {
		return sb.toString();
	}
}
