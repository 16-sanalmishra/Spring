package com.sprindemos.SpringWebORM.dao;

import java.util.List;

import com.sprindemos.SpringWebORM.entity.User;

public interface UserDao {

	int create(User user);

	List<User> findUsers();
}
