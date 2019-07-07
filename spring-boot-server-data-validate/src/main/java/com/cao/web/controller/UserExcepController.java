package com.cao.web.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cao.web.domain.Users;

/**
 * SpringBoot 表单数据校验
 *
 *
 */
@Controller
public class UserExcepController {
	@RequestMapping("/userExcepAddUser")
	public String showPage(){
		return "excep/add";
	}
	
	/**
	 * 完成用户添加
	 *@Valid 开启对Users对象的数据校验
	 *BindingResult:封装了校验的结果
	 */
	@RequestMapping("/userExcepSave")
	public String saveUser(@Valid Users users, BindingResult result){
		if (result.hasErrors()) {
			//校验出错，返回到 前一个页面
			return "add";
		}
		System.out.println(users);
		return "excep/ok";
	}
}
