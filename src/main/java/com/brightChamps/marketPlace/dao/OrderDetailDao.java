package com.brightChamps.marketPlace.dao;

import org.springframework.data.repository.CrudRepository;

import com.brightChamps.marketPlace.entity.OrderDetail;

public interface OrderDetailDao extends CrudRepository<OrderDetail, Long>{

}
