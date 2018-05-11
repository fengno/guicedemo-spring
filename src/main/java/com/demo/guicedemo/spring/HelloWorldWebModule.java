package com.demo.guicedemo.spring;

import org.demo.guicedemo.MyApplet;
import org.demo.guicedemo.hellodemo.MyDestination;
import org.demo.guicedemo.hellodemo.Output;
import org.demo.guicedemo.hellodemo.StringWritingApplet;

import com.google.inject.AbstractModule;
import com.google.inject.servlet.ServletModule;

public class HelloWorldWebModule extends AbstractModule {

	@Override
	protected void configure() {
		install(new ServletModule());
		bind(MyApplet.class).to(StringWritingApplet.class);
		bind(MyDestination.class).to(WebDestination.class);
		bind(String.class).annotatedWith(Output.class).toProvider(GreetingMessageProvider.class);
	}
	
/*	@Provides @Output String getOutputString(GreetingMessageProvider generator) {
//		return "hello " + params.getGreetingName(); // 其中hello属于业务逻辑，建议分离
		return generator.get();
	}*/

}
