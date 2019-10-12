package com.zensar.spring.replacers;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class MagicBoxReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {

		return " A beautiful girl ";
	}

}
