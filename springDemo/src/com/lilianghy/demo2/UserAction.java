package com.lilianghy.demo2;

public class UserAction  {

	//private UserService userServiceImpl = new UserServiceImpl();
	private UserService userServiceImpl = BeanFactory.getInstance("userServiceImpl", UserService.class);
	public String execute(){
		
		userServiceImpl.save();
		return "";
	}

}
