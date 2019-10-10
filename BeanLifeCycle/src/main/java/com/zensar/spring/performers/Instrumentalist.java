package com.zensar.spring.performers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist
		implements Performer, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean,DisposableBean {
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
		System.out.println("bean name is set !");

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("bean factory is set !");

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Application context is set !");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		//instrument.tune();

	}

	public void tuneInstrument() {
		System.out.println("Custome init method !");
		instrument.tune();
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
		instrument.clean();
		
	}
	public void cleanInstrument() {
		System.out.println("custom destroy method");
	}

}
