package com.lilianghy.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private ApplicationContext  ac = new ClassPathXmlApplicationContext("bean.xml",getClass());
	@Test
	public void Test1(){
		UserAction userAction = (UserAction) ac.getBean("userAction");
		userAction.execute();
	}
}
