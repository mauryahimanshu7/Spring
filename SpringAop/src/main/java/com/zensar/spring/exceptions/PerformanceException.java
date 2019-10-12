package com.zensar.spring.exceptions;

public class PerformanceException extends Exception {
	private String errorMessage;

	public PerformanceException() {
		errorMessage = "Sorry Performance is not good !";
	}

	public PerformanceException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "PerformanceException [errorMessage=" + errorMessage + "]";
	}
	

}
