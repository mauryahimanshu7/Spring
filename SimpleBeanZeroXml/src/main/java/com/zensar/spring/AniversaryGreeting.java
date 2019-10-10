package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("anivarsry")
public class AniversaryGreeting implements Greeting {

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Happy work aniversary";

	}

	public AniversaryGreeting() {
		System.out.println("anivarsary is created");
	}

}
