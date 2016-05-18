package com.dubito.cirru.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubito.cirru.controls.UserAction;
import com.dubito.cirru.dao.impl.UserDaoImpl;
import com.dubito.cirru.entity.User;

public class SuperTest {

	@Test
	public void userAction() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserAction userAction = (UserAction) ac.getBean("userAction");
		System.out.println(userAction.getClass());
	}
	
	
}
