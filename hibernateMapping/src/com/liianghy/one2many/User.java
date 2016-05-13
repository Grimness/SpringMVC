package com.liianghy.one2many;

import java.util.HashSet;
import java.util.Set;

public class User {

	private int id;
	private String name;
	private int age;
	private char sex;
	
	//一对多映射(一个用户对应多个地址)
	private Set<Address> addressSet = new HashSet<Address>();
	

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

	

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<Address> getAddressSet() {
		return addressSet;
	}

	public void setAddressSet(Set<Address> addressSet) {
		this.addressSet = addressSet;
	}


	
	
	
}
