package com.demo.guicedemo.spring;

import com.demo.guicedemo.MyApplet;
import com.demo.guicedemo.MyDestination;
import com.demo.guicedemo.Output;
import com.demo.guicedemo.StringWritingApplet;
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
		return params.getMessage();
	}

}
