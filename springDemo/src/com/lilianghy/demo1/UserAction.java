package com.lilianghy.demo1;

public class UserAction  {

	private UserService userServiceImpl = new UserServiceImpl();
	public String execute(){
		userServiceImpl.save();
		return "";
	}

}
