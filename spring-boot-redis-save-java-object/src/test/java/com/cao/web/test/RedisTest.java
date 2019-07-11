package com.cao.web.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cao.web.App;
import com.cao.web.domain.Users;

/**
 * Spring Data Redis测试
 *
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=App.class)
public class RedisTest {

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	/**
	 * 添加一个字符串
	 */
	@Test
	public void testSet(){
		this.redisTemplate.opsForValue().set("caoTestKey", "This is my first Redis value");
	}
	
	/**
	 * 获取一个字符串
	 */
	@Test
	public void testGet(){
		String value = (String)this.redisTemplate.opsForValue().get("caoTestKey");
		System.out.println(value);
	}
	
	/**
	 * 添加Users对象
	 */
	@Test
	public void testSetUesrs(){
		Users users = new Users();
		users.setAge(20);
		users.setName("曹操");
		users.setId(1);
		//重新设置序列化器
		this.redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
		this.redisTemplate.opsForValue().set("users", users);
	}
	
	/**
	 * 取Users对象
	 */
	@Test
	public void testGetUsers(){
		//重新设置序列化器
		this.redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
		Users users = (Users)this.redisTemplate.opsForValue().get("users");
		System.out.println(users);
	}
	
}
