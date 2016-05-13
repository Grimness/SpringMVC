package com.liianghy.one2many;



import java.util.Iterator;
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
		user.setAge(22);
		user.setName("李大帅");
		user.setSex('男');
		Address address = new Address();
		address.setAddress("北京海定区");
		address.setCity("北京");
		address.setProvince("北京直辖市");
		address.setCode("342344");

		Address address1 = new Address();
		address1.setAddress("广州番禺区");
		address1.setCity("广州");
		address1.setProvince("广东省");
		address1.setCode("3445454");
		
		address.setUser(user);
		address1.setUser(user);
		
		session.save(user);
		
		session.save(address);
		session.save(address1);
		
	
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
		
		User user = (User) session.get(User.class, 3);
		System.out.println(user.getName());
		
		
		
	
		//提交事务  获取绑定到session的事务并提交
		session.getTransaction().commit();
		session.close();
		
	}
	
}
