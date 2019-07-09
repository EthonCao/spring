package com.cao.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cao.web.dao.UserDao;
import com.cao.web.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDaoImpl;
	
	public void addUser(){
		this.userDaoImpl.saveUser();
	}
}
