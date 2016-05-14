package com.lilianghy.demo3_ioc;

/**
 * 类工厂
 * @author Administrator
 *
 */
public class BeanFactory {

	//spring在工厂类，调用静态方法 不会创建工厂对象
	public BeanFactory(){
		System.out.println("BeanFactory");
	}
	public static User getStaticUser(){
		return new User(1,"静态方法创建对象");
	}
	public User getUser(){
		return new User(1,"非静态方法创建对象");
	}
}
