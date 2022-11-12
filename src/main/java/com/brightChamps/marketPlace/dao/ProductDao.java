package com.brightChamps.marketPlace.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.brightChamps.marketPlace.entity.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer>{

}
