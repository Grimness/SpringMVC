package com.liianghy.entity;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class App {
	
	private static SessionFactory  sf;
	static{
		sf = new Configuration()
				.configure()
				//.addClass(Employee.class)//通过类名称加载对应的配置文件（不推荐）
				.buildSessionFactory();
	}
	

	@Test
	public void demoAdd(){
		//创建session会话对象
		Session session = sf.openSession();
		//开启事务
		session.beginTransaction();
		
	
		
		User user = new User();
		user.setName("王尼玛");
		//set集合
		user.getAddressSet().add("北京");
		user.getAddressSet().add("河池");
		user.getAddressSet().add("南宁");
		
		//list集合
		user.getAddressList().add("Hongkong");
		user.getAddressList().add("GZ");
		user.getAddressList().add("BJ");
		
		//map集合
		user.getAddressMap().put("GZ", "广州");
		user.getAddressMap().put("BJ", "北京");
		session.save(user);
	
		//提交事务  获取绑定到session的事务并提交
		session.getTransaction().commit();
		session.close();
		
	}
	
	@Test
	public void demoGet(){
		//创建session会话对象
		Session session = sf.openSession();
		//开启事务
		session.beginTransaction();
		
		//User user = new User();
		
		User user = (User) session.get(User.class, 7);
		System.out.println(user.getName());
		//System.out.println(user.getAddressList());
		System.out.println(user.getAddressMap());
	
		//提交事务  获取绑定到session的事务并提交
		session.getTransaction().commit();
		session.close();
		
	}
	
}
