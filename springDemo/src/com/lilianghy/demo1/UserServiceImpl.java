package com.lilianghy.demo1;

import com.lilianghy.demo2.BeanFactory;

public class UserServiceImpl implements UserService {

	//private UserDao userDaoImpl = new UserDaoImpl();
	private UserDao userDaoImpl = new UserDaoOrecleImpl();
	@Override
	public void save() {

		userDaoImpl.save();
	}

}
