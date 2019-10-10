package com.zensar.spring.performers;

import org.springframework.beans.factory.BeanNameAware;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer, BeanNameAware {
	private Instrument instrument;
	private String song;
	private String name;

	public Instrumentalist() {
		// TODO Auto-generated constructor stub
		System.out.println("instrumentalist is created");
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("instrument is set");
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
		System.out.println("song is set");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("instrumentalist " + name + " is playing a song " + song);
		instrument.play();

	}

	@Override
	public void setBeanName(String name) {
		this.name = name;
		
	}

}
