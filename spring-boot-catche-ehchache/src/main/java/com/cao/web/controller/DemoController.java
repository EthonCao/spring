package com.cao.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SpringBoot 表单数据校验
 */
@Controller
public class DemoController {
	@RequestMapping("/show")
	public String showPage(){
		String str = null;
		str.length();
		return "add";
	}
	
	@RequestMapping("/show2")
	public String showInfo2(){
		int a = 10/0;
		return "index";
	}

}
