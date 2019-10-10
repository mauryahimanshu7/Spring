package com.zensar.spring.performers;

import java.lang.instrument.Instrumentation;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {
	private Properties instrumentSongProps;
	
	public Properties getInstrumentSongProps() {
		return instrumentSongProps;
	}

	public void setInstrumentSongProps(Properties instrumentSongProps) {
		this.instrumentSongProps = instrumentSongProps;
	}

	@Override
	public void perform() {
		Enumeration instruments = instrumentSongProps.keys();
		while(instruments.hasMoreElements()) {
			String instrumentName =(String) instruments.nextElement();
			
			String song =getInstrumentSongProps().getProperty(instrumentName);
			System.out.println("song "+song + " by : "+instrumentName);
		}
		
	}
	

}
