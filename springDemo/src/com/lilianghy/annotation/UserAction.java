package com.lilianghy.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
//定义一个组件，加入到IOC容器
@Component("userAction")
public class UserAction  {

	private UserService userServiceImpl;
	@Resource(name="userServiceImpl")
	public void setUserServiceImpl(UserService userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
	public String execute(){
		userServiceImpl.save();
		return "";
	}

}
