package com.lilianghy.annotation;

import org.springframework.stereotype.Component;
//定义一个注解组件  交给Spring的IOC容器
@Component("userDaoImpl")
public class UserDaoImpl implements UserDao {

	@Override
	public void save() {
		
		System.out.println("mysql保存！");
		
	}

}
