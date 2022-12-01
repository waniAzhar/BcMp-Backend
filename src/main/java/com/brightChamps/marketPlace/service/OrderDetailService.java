package com.brightChamps.marketPlace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brightChamps.marketPlace.configuration.JwtRequestFilter;
import com.brightChamps.marketPlace.dao.OrderDetailDao;
import com.brightChamps.marketPlace.dao.ProductDao;
import com.brightChamps.marketPlace.dao.UserDao;
import com.brightChamps.marketPlace.entity.OrderDetail;
import com.brightChamps.marketPlace.entity.OrderInput;
import com.brightChamps.marketPlace.entity.OrderProductQuantity;
import com.brightChamps.marketPlace.entity.Product;
import com.brightChamps.marketPlace.entity.User;

@Service
public class OrderDetailService {
	
	private static final String ORDER_PLACED = "Placed";
	
	@Autowired
	private OrderDetailDao orderDetailDao;
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private UserDao userDao;
	
	public void placeOrder(OrderInput orderInput) {
		List<OrderProductQuantity> productQuantityList = orderInput.getOrderProductQuantityList();
		
		for(OrderProductQuantity o: productQuantityList) {
			Product product = productDao.findById(o.getProductId()).get();
			String currentUser = JwtRequestFilter.CURRENT_USER;
			User user = userDao.findById(currentUser).get();
			OrderDetail orderDetail = new OrderDetail(
					orderInput.getOrderAmount(),
					ORDER_PLACED,
					orderInput.getEmailId(),
					product,
					user
					);
			
			orderDetailDao.save(orderDetail);
		}
		
	}

}
