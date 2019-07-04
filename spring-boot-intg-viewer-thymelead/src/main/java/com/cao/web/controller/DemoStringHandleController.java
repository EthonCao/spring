package com.cao.web.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Thymeleaf入门案例
 *
 *
 */
@Controller
public class DemoStringHandleController {
	@RequestMapping("/showStringHandle")
	public String showInfo(HttpServletRequest request,Model model){
		model.addAttribute("msg", "Thymeleaf 第一个案例");
		model.addAttribute("key", new Date());
		return "indexStringHandle";
	}
}
