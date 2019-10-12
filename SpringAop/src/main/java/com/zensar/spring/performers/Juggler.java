package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.exceptions.PerformanceException;

@Component("himanshu")
public class Juggler implements Performer {
	@Value("5")
	private int beanBags;

	@Override
	public void perform() throws PerformanceException {
		if(beanBags<3) {
			throw new PerformanceException("less number of bags !");
		}
		else {
			System.out.println("Juggler juggling !");		}
	}

}
