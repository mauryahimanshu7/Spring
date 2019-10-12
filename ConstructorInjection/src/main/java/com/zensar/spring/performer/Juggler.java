package com.zensar.spring.performer;

public class Juggler implements Performer {

	
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("juggler juggling bean bags " +beanBags);

	}
	private int beanBags;
		
	public Juggler() {
		// TODO Auto-generated constructor stub
		System.out.println(" no arg constructor of juggler");
	}

	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
		System.out.println(" parameterized constructor of juggler");
	}
	
	
	

}
