package com.demo.guicedemo.spring;


import org.springframework.context.ApplicationContext;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class SpringAwareModule extends AbstractModule {
	private final ApplicationContext context;
	
	public SpringAwareModule(ApplicationContext context) {
		this.context = context;
	}

	@Override
	protected void configure() {
		bind(ApplicationContext.class).toInstance(context);
	}
	
	@Provides
	SampleDao getSampleDao(ApplicationContext context) {
		return context.getBean(SampleDao.class);
	}
}
