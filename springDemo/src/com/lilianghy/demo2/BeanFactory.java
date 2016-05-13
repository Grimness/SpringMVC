package com.lilianghy.demo2;

import java.util.ResourceBundle;

public class BeanFactory {

	//读取配置文件
	private static ResourceBundle bundle;
	static{
		//根据文件名称读取文件
		bundle = ResourceBundle.getBundle("com/lilianghy/demo2/instance");
	}
	/**
	 * 读取配置文件创建对象
	 * @param T 传入的接口的类型
	 * @param key  要创建的对象，在配置文件中的key
	 * @param clazz 创建的对象的接口类型
	 * @return 传入什么类型返回的就是什么类型
	 */
	public static <T>  T  getInstance(String key,Class<T> clazz){
		try {
			//获取类的全路径 userDao=com.lilianghy.demo2.UserDao
			String className = bundle.getString(key);
			//获取类名称
			Class<T> forName = (Class<T>) Class.forName(className);
			//创建对象
			T t = forName.newInstance();
			return t;
		} catch (Exception e) {
			
			throw new RuntimeException(e);
		}
		
	}
}
