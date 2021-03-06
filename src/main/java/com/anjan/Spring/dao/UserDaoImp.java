package com.anjan.Spring.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anjan.Spring.model.User;

@Repository
public class UserDaoImp implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;
	

	public void save(User user){
		sessionFactory.getCurrentSession().save(user);
	}

	public List<User> list() {
		@SuppressWarnings("unchecked")
		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
		return query.getResultList();
	}
	
}
