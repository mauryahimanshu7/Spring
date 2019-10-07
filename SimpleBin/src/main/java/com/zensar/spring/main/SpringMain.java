package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.Greeting;


public class SpringMain {

	public static void main(String[] args) {
		
		//creating the object of spring ioc container.
		ApplicationContext ctx = new ClassPathXmlApplicationContext("greetings.xml");
		Greeting g= ctx.getBean("anivarsary", Greeting.class);
		System.out.println(g.greet());
		Greeting g1= ctx.getBean("festival", Greeting.class);
		System.out.println(g1.greet());
		

	}

}
