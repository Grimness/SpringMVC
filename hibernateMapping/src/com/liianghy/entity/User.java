package com.liianghy.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {

	private int id;
	private String name;
	
	//set集合映射
	private Set<String> addressSet = new HashSet<String>();
	//list集合映射
	private List<String> addressList  = new ArrayList<String>();
	//map集合映射
	private Map<String, String> addressMap = new HashMap<>();
	
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
	
	public Set<String> getAddressSet() {
		return addressSet;
	}
	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}
	
	
	public List<String> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
	
	
	public Map<String, String> getAddressMap() {
		return addressMap;
	}
	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", addressSet=" + addressSet + "]";
	}
	
	
	
}
