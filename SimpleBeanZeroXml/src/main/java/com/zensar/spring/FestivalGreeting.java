package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("festival")
public class FestivalGreeting implements Greeting {

	@Override
	public String greet() {

		return "Happy today";
	}

	public FestivalGreeting() {
		System.out.println("Festival greeting is created !");
	}

}
