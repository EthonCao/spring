package com.cao.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cao.web.domain.Users;

/**
 * SpringBoot 表单数据校验
 */
@Controller
public class UserController {
	@RequestMapping("/addUser")
	public String showPage(){
		return "add";
	}
	
	/**
	 * 完成用户添加
	 */
	@RequestMapping("/save")
	public String saveUser(Users users){
		System.out.println(users);
		return "ok";
	}
}
