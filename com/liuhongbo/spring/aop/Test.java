package com.liuhongbo.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/liuhongbo/spring/aop/applicationContext.xml");
		TestServiceInterface tsi = (TestServiceInterface) ac.getBean("proxyFactoryBean");
		tsi.sayHello();
		((TestServiceInterface2)tsi).sayBye();
	}
}
