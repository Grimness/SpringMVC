package com.lilianghy.demo2;

import com.lilianghy.demo2.UserDao;

public class UserServiceImpl implements UserService {

	
	
	//private UserDao userDaoImpl = new UserDaoImpl();
	//private UserDao userDaoImpl = new UserDaoOrecleImpl();
	private UserDao userDaoImpl = BeanFactory.getInstance("userDaoImpl", UserDao.class);
	@Override
	public void save() {

		userDaoImpl.save();
	}

}
