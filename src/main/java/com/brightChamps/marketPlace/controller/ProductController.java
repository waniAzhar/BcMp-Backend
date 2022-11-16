package com.brightChamps.marketPlace.controller;


import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.brightChamps.marketPlace.entity.ImageModel;
import com.brightChamps.marketPlace.entity.Product;
import com.brightChamps.marketPlace.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	@PreAuthorize("hasRole('Admin')")
	@PostMapping(value = {"/addNewProduct"}, consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
	public Product addNewProduct(@RequestPart("product") Product product, 
								@RequestPart("imageFile") MultipartFile[] file) {
		//return productService.addNewProduct(product);
		
		try {
			Set<ImageModel> images = uploadImage(file);
			product.setProductImages(images);
			return productService.addNewProduct(product);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return null;
		}
		
		
	}
	
	public Set<ImageModel> uploadImage(MultipartFile[] multipartFiles) throws IOException {
		
		Set<ImageModel> imageModels = new HashSet<>();
		
		for(MultipartFile file: multipartFiles) {
		
			ImageModel imageModel = new ImageModel(
					
					file.getOriginalFilename(),
					file.getContentType(),
					file.getBytes()
					
					);
			
			imageModels.add(imageModel);
		
	}
	
		 return imageModels;
}}
