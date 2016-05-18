package com.dubito.cirru.controls;

import javax.management.RuntimeErrorException;

import com.dubito.cirru.entity.User;
import com.dubito.cirru.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	private UserService userServiceImpl;
	public void setUserServiceImpl(UserService userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}

	public UserAction() {
		System.out.println("实例化。。。");
	}
	private User user;
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	@Override
	public String execute(){
		System.out.println("成功跳转到Action类");
		try {
			userServiceImpl.save(user);
		} catch (Exception e) {
			return "error";//指定错误页面
			//throw new RuntimeException("获取数据错误",e);
		}
		return SUCCESS;

	}
}
