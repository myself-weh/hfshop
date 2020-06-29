package com.weh.hfshop.utils;

import java.lang.reflect.Method;


import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class HfLog implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice {

	

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("方法执行结束 " + method.getName());
		System.out.println("返回数据是 " + returnValue);
	}

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("开始执行方法 " + target.getClass().getSimpleName() + "." + method.getName());
		System.out.println("参数分别为：");
		for (Object object : args) {
			System.out.append(object.toString());
		}
	}

	public void afterThrowing(Method method, Object[] args, Object target, Throwable throwable) {
		System.out.println("afterThrowing   111111111 ");
	}

	public void afterThrowing(Throwable throwable) {

		System.out.println("afterThrowing  2222222");
	}
}
