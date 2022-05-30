package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;

@RestController
@RequestMapping("products")	// http://localhost:8080/products/
public class ProductController {

	
	@Autowired
	ProductService productService;
	
	
	@GetMapping(value = "findAllProduct",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findAllProdut(){
		return productService.findAllProduct();
	}
	
	@PostMapping(value = "storeProduct",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProduct(@RequestBody Product product) {
		return productService.storeProduct(product);
	}
	
	
}
