package com.lilianghy.demo2;

public class App {

	public static void main(String[] args) throws Exception {
		
//		Class<?>  forName = Class.forName("com.lilianghy.demo2.UserAction");
//		UserAction action = (UserAction) forName.newInstance();
		UserAction action = new UserAction();
		action.execute();
	}
}
