package com.zensar.spring.performers;

import java.lang.instrument.Instrumentation;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {
	private Map<Instrument, String> instrumentSongMap;

	public Map<Instrument, String> getInstrumentSongMap() {
		return instrumentSongMap;
	}

	public void setInstrumentSongMap(Map<Instrument, String> instrumentSongMap) {
		this.instrumentSongMap = instrumentSongMap;
	}

	@Override
	public void perform() {

		System.out.println("instrumantalist is playing songs");
		for (Entry<Instrument, String> entry : instrumentSongMap.entrySet()) {
			System.out.println("Key = " + entry.getValue() +  "play : " );
			entry.getKey().play();
		}
			
	}

}
