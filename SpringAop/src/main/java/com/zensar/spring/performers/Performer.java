package com.zensar.spring.performers;

import com.zensar.spring.exceptions.PerformanceException;

public interface Performer {
	void perform() throws PerformanceException;
	
}
