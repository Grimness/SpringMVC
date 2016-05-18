package com.dubito.cirru.service.impl;

import com.dubito.cirru.dao.UserDao;
import com.dubito.cirru.entity.User;
import com.dubito.cirru.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDaoImpl;
	public void setUserDaoImpl(UserDao userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}
	
	public void save(User user) {
		userDaoImpl.save(user);
		
	}

}
