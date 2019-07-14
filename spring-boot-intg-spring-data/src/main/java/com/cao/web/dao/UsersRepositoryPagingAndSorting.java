package com.cao.web.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cao.web.domain.Users;

/**
 * 
 *PagingAndSortingRepository接口
 *
 */
public interface UsersRepositoryPagingAndSorting extends PagingAndSortingRepository<Users,Integer> {

}
