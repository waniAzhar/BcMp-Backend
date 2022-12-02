package com.brightChamps.marketPlace.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.brightChamps.marketPlace.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
	User findByUserName(String userName);
}
