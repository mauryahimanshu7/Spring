package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("performer.xml");
		Performer p = ctx.getBean("akansh",Performer.class ); 
		p.perform();
		ConfigurableApplicationContext cfgctx = (ConfigurableApplicationContext) ctx;
		cfgctx.close(); // stutting down spring ioc container
	}

}
