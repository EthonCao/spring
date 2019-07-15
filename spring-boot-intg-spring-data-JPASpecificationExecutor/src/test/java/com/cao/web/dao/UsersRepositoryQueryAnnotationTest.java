package com.cao.web.dao;


import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
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
public class UsersRepositoryQueryAnnotationTest {

	@Autowired
	private UsersRepositoryQueryAnnotation usersRepositoryQueryAnnotation;
	
	/**
	 * Repository--@Query测试
	 */
	@Test
	public void testQueryByNameUseHQL() {
		List<Users> list = this.usersRepositoryQueryAnnotation.queryByNameUseHQL("张三");
		for (Users users : list) {
			System.out.println(users);
		}
	}

	/**
	 * Repository--@Query测试
	 */
	@Test
	public void testQueryByNameUseSQL() {
		List<Users> list = this.usersRepositoryQueryAnnotation.queryByNameUseSQL("张三");
		for (Users users : list) {
			System.out.println(users);
		}
	}

	/**
	 * Repository--@Query测试
	 */
	@Test
	@Transactional //@Transactional与@Test 一起使用时 事务是自动回滚的。
	@Rollback(false) //取消自动回滚
	public void testUpdateUsersNameById() {
		this.usersRepositoryQueryAnnotation.updateUsersNameById("张三三", 1);
	}
	
	

}
