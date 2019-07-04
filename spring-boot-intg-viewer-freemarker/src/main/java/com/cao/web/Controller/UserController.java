package com.cao.web.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cao.web.domain.User;

@Controller
public class UserController {
	/*
	 * 处理请求，产生数据
	 */
	@RequestMapping("/showUser")
	public String showUser(Model model){
		List<User> list = new ArrayList<User>();
		list.add(new User(1,"张三",20));
		list.add(new User(2,"李四",22));
		list.add(new User(3,"王五",24));
		
		//需要一个Model对象
		model.addAttribute("list", list);
		//跳转视图
		return "userList";
	}
}