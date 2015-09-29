package com.liuhongbo.spring.sample1.service;

public class Person {
	private String name;
	private Bye bye;

	public Bye getBye() {
		return bye;
	}

	public void setBye(Bye bye) {
		this.bye = bye;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println("hello world " + name);
		bye.sayBye();
	}
	
}
