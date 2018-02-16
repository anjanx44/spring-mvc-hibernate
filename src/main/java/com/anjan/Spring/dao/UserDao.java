package com.anjan.Spring.dao;

import java.util.List;

import com.anjan.Spring.model.User;

public interface UserDao {
	void save(User user);
	List<User> list();
	
}
