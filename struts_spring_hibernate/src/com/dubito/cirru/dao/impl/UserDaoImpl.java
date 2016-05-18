package com.dubito.cirru.dao.impl;

import org.hibernate.SessionFactory;

import com.dubito.cirru.dao.UserDao;
import com.dubito.cirru.entity.User;

public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void save(User user) {
		
	
		sessionFactory.getCurrentSession().save(user);
	
	}

}
