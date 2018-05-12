package com.demo.guicedemo.server.greeting;

import org.demo.guicedemo.MyApplet;
import org.demo.guicedemo.hellodemo.MyDestination;
import org.demo.guicedemo.hellodemo.Output;
import org.demo.guicedemo.hellodemo.StringWritingApplet;

import com.google.inject.AbstractModule;

public class HelloWorldWebModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(MyApplet.class).to(StringWritingApplet.class);
    bind(MyDestination.class).to(WebDestination.class);

    bind(String.class).annotatedWith(Output.class)
      .toProvider(GreetingMessageProvider.class);
  }
}
