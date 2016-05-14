package com.lilianghy.demo3_ioc;

public class User {

	private int id;
	private String name;
	
	
	public User() {
		System.out.println("User对象创建了！");
	}
	
	
	public User(int id, String name) {
		System.out.println("带参数的构造方法创建对象");
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void user_init(){
		System.out.println("user 初始化。。。。。。");
	}
	public  void user_destroy(){
		System.out.println("user被销毁了。。。。。");
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
}
