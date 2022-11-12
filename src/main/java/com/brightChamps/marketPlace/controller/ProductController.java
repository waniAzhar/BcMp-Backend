package com.brightChamps.marketPlace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.brightChamps.marketPlace.entity.Product;
import com.brightChamps.marketPlace.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping({"/addNewProduct"})
	public Product addNewProduct(@RequestBody Product product) {
		return productService.addNewProduct(product);
	}
	
}
