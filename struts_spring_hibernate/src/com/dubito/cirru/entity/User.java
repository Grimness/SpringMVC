package com.dubito.cirru.entity;

public class User {

	private int id;
	private String name;
	private int age;
	private char sex;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, int age, char sex) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	
}
