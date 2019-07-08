package com.cao.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * SpringBoot 表单数据校验
 */

@Controller
public class DemoController2 {
	@RequestMapping("/show1111")
	public String showInfo(){
		String str = null;
		str.length();
		return "index";
	}
	
	

}
