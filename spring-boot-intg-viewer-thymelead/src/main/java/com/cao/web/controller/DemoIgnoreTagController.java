package com.cao.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * thymeleaf hello world
 * @author Cao
 *
 */
@Controller
public class DemoIgnoreTagController {

	@RequestMapping("/showIgnoreTag")
	public String showInfo(Model model) {
		model.addAttribute("msg", "thymeleaf helo world");
		return "indexIgnoreTag";
	}
	
}
