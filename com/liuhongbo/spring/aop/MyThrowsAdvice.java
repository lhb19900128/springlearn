package com.liuhongbo.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {
	
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex){
		System.out.println(ex.getMessage());
	}
}
