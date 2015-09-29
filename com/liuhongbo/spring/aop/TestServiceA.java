package com.liuhongbo.spring.aop;

public class TestServiceA implements TestServiceInterface,
		TestServiceInterface2 {

	private String name;

	@Override
	public void sayHello() {
		System.out.println("hello " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayBye() {
		System.out.println("bye " + name);
	}

}
