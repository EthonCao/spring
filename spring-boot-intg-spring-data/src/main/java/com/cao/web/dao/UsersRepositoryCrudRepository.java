package com.cao.web.dao;

import org.springframework.data.repository.CrudRepository;

import com.cao.web.domain.Users;


/**
 * CrudRepository接口
 *
 *
 */
public interface UsersRepositoryCrudRepository extends CrudRepository<Users, Integer> {

}
