package com.lilianghy.annotation;


import javax.annotation.Resource;

import org.springframework.stereotype.Component;

//定义一个注解组件  引用userDaoImpl
@Component("userServiceImpl")
public class UserServiceImpl implements UserService {

	private UserDao userDaoImpl;
	//Spring会从IOC容器中找到名称为userDaoImpl的组件
	@Resource(name="userDaoImpl")
	public void setUserDaoImpl(UserDao userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}
	@Override
	public void save() {

		userDaoImpl.save();
	}

}
