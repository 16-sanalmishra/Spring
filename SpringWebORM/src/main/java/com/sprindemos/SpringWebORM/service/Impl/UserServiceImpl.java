package com.sprindemos.SpringWebORM.service.Impl;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprindemos.SpringWebORM.dao.UserDao;
import com.sprindemos.SpringWebORM.entity.User;
import com.sprindemos.SpringWebORM.service.UserService;



@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public int save(User user) {
		return userDao.create(user);
	}
	
	@Override
	public List<User> getUsers() {
		List<User> users = userDao.findUsers();
		Collections.sort(users);
		return users;
	}
	
}
