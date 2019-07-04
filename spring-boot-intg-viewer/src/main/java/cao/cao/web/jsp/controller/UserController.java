package cao.cao.web.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cao.cao.web.jsp.domain.User;

/**
 * spring boot integrate with jsp
 * @author Cao
 *
 */
@Controller
public class UserController {
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/showUser")
	public String showUser(Model model) {
		List<User> list = new ArrayList<User>();
		list.add(new User(1, "zhangsan", 20));
		list.add(new User(2, "LISI", 23));
		list.add(new User(3, "WANGWU", 25));
		
		//设置Model对象
		model.addAttribute("list", list);
		//跳转视图
		return "userList";
		
	}
}
