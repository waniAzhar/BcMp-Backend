package com.brightChamps.marketPlace.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.brightChamps.marketPlace.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
