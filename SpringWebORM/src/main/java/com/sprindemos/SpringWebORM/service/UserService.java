package com.sprindemos.SpringWebORM.service;

import java.util.List;

import com.sprindemos.SpringWebORM.entity.User;

public interface UserService {
	int save(User user);
	List<User> getUsers();
}
