package com.lilianghy.dependencyInjection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	//创建容器方式一
	//ApplicationContext ac = new ClassPathXmlApplicationContext("com/lilianghy/dependencyInjection/bean.xml");
	//创建容器方式二
	private ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml",getClass());
	@Test
	public void Demo(){
		User user = (User) ac.getBean("user");
		System.out.println(user);
		
	}
}
