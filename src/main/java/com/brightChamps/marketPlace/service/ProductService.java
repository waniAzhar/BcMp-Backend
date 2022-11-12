package com.brightChamps.marketPlace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brightChamps.marketPlace.dao.ProductDao;
import com.brightChamps.marketPlace.entity.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;
	
	public Product addNewProduct(Product product) {
		return productDao.save(product);
		
	}
}
