package com.liuhongbo.spring.sample1.test;

import org.springframework.context.ApplicationContext;

import com.liuhongbo.spring.sample1.service.Person;
import com.liuhongbo.spring.sample1.util.ApplicationContextUtil;


public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = ApplicationContextUtil.getInstance();
		Person person = (Person) applicationContext.getBean("person");
		person.sayHello();
	}	

}

