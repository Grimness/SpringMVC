package com.lilianghy.demo3_ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
	private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/lilianghy/demo3_ioc/bean2.xml");

	@Test
	public void SpringIocDemo(){
		
		//加载Spring配置文件  applicationContext.xml
//       System.out.println(applicationContext.getBean("user"));
//       System.out.println(applicationContext.getBean("str"));
			System.out.println(applicationContext.getBean("user3"));
        
	}
	
	
	
	
}
