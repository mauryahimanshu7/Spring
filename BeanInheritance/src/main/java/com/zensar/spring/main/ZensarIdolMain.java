package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("performer.xml");
		Performer p = ctx.getBean("akansh", Performer.class);
		p.perform();
		Performer p2 = ctx.getBean("maurya", Performer.class);
		p2.perform();
		Performer p3 = ctx.getBean("himanshu", Performer.class);
		p3.perform();
	}

}
