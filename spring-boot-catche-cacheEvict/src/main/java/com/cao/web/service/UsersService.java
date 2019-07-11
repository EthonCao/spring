package com.cao.web.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cao.web.domain.Users;

public interface UsersService {
	
	List<Users> findUserAll();
	Users findUserById(Integer id);
	Page<Users> findUserByPage(Pageable pageable);
	void saveUsers(Users users);
}
