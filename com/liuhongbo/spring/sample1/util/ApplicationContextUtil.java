package com.liuhongbo.spring.sample1.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class ApplicationContextUtil {
	private static ApplicationContext applicationContext;
	
	private ApplicationContextUtil(){
		
	}
	
	public static ApplicationContext getInstance(){
		if(applicationContext == null){
			applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		}
		return applicationContext;
	}
}
