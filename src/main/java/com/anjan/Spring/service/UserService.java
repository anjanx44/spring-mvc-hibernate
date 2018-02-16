package com.anjan.Spring.service;

import java.util.List;

import com.anjan.Spring.model.User;

public interface UserService {
	void save(User user);

	List<User> list();
}
