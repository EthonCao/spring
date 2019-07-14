package com.cao.web.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cao.web.App;
import com.cao.web.dao.UsersRepository;
import com.cao.web.domain.Users;

/**
 * 测试类
 *
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public class UsersRepositoryTest {

	@Autowired
	private UsersRepository usersRepository;


	
	
	@Test
	public void testSave() {
		Users users = new Users();
		users.setAddress("上海市");
		users.setAge(24);
		users.setName("王五");
		this.usersRepository.save(users);
	}


	
	
	
	/**
	 * JapRepository   排序测试
	 */
	@Test
	public void testJpaRepositorySort() {
		//Order 定义排序规则
		Order order = new Order(Direction.DESC,"id");
		//Sort对象封装了排序规则
		Sort sort = new Sort(order);
		List<Users> list = this.usersRepository.findAll(sort);
		for (Users users : list) {
			System.out.println(users);
		}
	}
	
}
