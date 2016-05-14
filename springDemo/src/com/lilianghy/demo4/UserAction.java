package com.lilianghy.demo4;

public class UserAction  {

	private UserService userServiceImpl;
	public void setUserServiceImpl(UserService userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
	public String execute(){
		userServiceImpl.save();
		return "";
	}

}
