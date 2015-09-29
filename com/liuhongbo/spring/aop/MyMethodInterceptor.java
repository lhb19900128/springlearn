package com.liuhongbo.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("调用方法前执行");
		Object object = arg0.proceed();
		System.out.println("调用方法后执行");
		return object;
	}

}
