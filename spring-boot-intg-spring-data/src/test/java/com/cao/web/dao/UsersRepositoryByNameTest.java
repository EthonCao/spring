package com.cao.web.dao;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cao.web.App;
import com.cao.web.domain.Users;

/**
 * 测试类
 *
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public class UsersRepositoryByNameTest {

	@Autowired
	private UsersRepositoryByName usersRepositoryByName;
	
	/**
	 * Repository--方法名称命名测试
	 */
	@Test
	public void testFindByName() {
		List<Users> list = this.usersRepositoryByName.findByName("张三");
		for (Users users : list) {
			System.out.println(users);
		}
	}

	/**
	 * Repository--方法名称命名测试
	 */
	@Test
	public void testFindByNameAndAge() {
		List<Users> list = this.usersRepositoryByName.findByNameAndAge("张三", 20);
		for (Users users : list) {
			System.out.println(users);
		}
	}

	/**
	 * Repository--方法名称命名测试
	 */
	@Test
	public void testFindByNameLike() {
		List<Users> list = this.usersRepositoryByName.findByNameLike("张%");
		for (Users users : list) {
			System.out.println(users);
		}
	}

}
