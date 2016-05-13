package com.liianghy.many2one;



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
		user.setName("李天明");
		user.setSex('男');
		Address address = new Address();
		address.setAddress("北京海定区");
		address.setCity("北京");
		address.setProvince("北京直辖市");
		address.setCode("342344");
		address.setUser(user);
		
		session.save(user);
		session.save(address);
	
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
		
		Address address = (Address) session.get(Address.class, 1);
		System.out.println(address.getAddress());
		
		
	
		//提交事务  获取绑定到session的事务并提交
		session.getTransaction().commit();
		session.close();
		
	}
	
}
