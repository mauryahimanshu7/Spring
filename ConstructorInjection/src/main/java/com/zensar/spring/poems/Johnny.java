package com.zensar.spring.poems;

public class Johnny implements Poem {
	private static final String line[]= {
			"Johny Johny",
			"Yes papa?",
			"Eating sugar?",
			"No papa.",
			"Telling lies?",
			"No papa.",
			"Open your mouth Ha ha ha!"	};
	
	public void recite() {
		// TODO Auto-generated method stub
		for(String l:line) {
			System.out.println(l);
		}

	}

}
