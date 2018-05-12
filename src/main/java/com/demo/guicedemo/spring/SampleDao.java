package com.demo.guicedemo.spring;

import org.springframework.stereotype.Component;

@Component
public class SampleDao {

	public void save(String data) {
		System.out.println(data + " saved.");
	}
	
	public String getPersonData(String name) {
		System.out.println("Getting person data for: " + name);
		return name;
	}
}
