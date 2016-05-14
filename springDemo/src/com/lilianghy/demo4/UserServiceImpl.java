package com.lilianghy.demo4;


public class UserServiceImpl implements UserService {

	private UserDao userDaoImpl;
	public void setUserDaoImpl(UserDao userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}
	@Override
	public void save() {

		userDaoImpl.save();
	}

}
