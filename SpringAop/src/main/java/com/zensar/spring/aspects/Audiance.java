package com.zensar.spring.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audiance {
	@Pointcut("execution(* *.perform(..))")
	// @Pointcut("execution(void *.perform(..)")
	// @Pointcut("execution(void com.zensar.spring.performers.Juggler.perform(..)")
	// @Pointcut("execution(public void
	// com.zensar.spring.performers.Juggler.perform(..)")
	public void performancePointCut() {

	}

	@Before("execution(* *.perform(..))")
	public void takeSeats() {
		System.out.println("Audiance is takeing there seats !");
	}

	@Before("performancePointCut()")
	public void switchOffCellphones() {
		System.out.println("audiance is switching off there cellphones !");
	}

	@AfterReturning("performancePointCut()")
	public void uploud() {
		System.out.println("CLAP CLAP CLAP CLAP");
	}

	@AfterThrowing("performancePointCut()")
	public void demandRefund() {
		System.out.println("Paisa do bhai !!!");
	}
}
