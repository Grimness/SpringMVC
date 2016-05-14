package com.lilianghy.demo3_ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@Test
	public void SpringIocDemo(){
		
		//加载Spring配置文件  applicationContext.xml
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/lilianghy/demo3_ioc/applicationContext.xml");
        User user = (User) applicationContext.getBean("user1");
        
	}
	
	@Test
	public void SpringIocDemo1(){
		
		//加载Spring配置文件  applicationContext.xml
          ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/lilianghy/demo3_ioc/bean.xml");
        User user = (User) applicationContext.getBean("user");
        User user1 = (User) applicationContext.getBean("user");
        applicationContext.destroy();
	}
	
	
}
