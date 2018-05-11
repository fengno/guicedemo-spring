package com.demo.guicedemo.spring;

import org.demo.guicedemo.MyApplet;
import org.demo.guicedemo.hellodemo.MyDestination;
import org.demo.guicedemo.hellodemo.Output;
import org.demo.guicedemo.hellodemo.StringWritingApplet;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.servlet.ServletModule;

public class HelloWorldWebModule extends AbstractModule {

	@Override
	protected void configure() {
		install(new ServletModule());
		bind(MyApplet.class).to(StringWritingApplet.class);
		bind(MyDestination.class).to(WebDestination.class);
	}
	
	@Provides @Output String getOutputString(RequestParams params) {
		return params.getGreetingName();
	}

}
