package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	// http://localhost:8080/storeProduct 
	
	@RequestMapping(value = "storeProduct",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.POST)
	public String storeProduct(@RequestBody Product product) {
		return productService.storeProduct(product);
	}
	
	// http://localhost:8080/updateProduct 
	@RequestMapping(value = "updateProduct",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.PUT)
	public String updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
	// http://localhost:8080/deleteProduct/100
	
	@RequestMapping(value = "deleteProduct/{pid}",method = RequestMethod.DELETE)
	public String storeProduct(@PathVariable("pid") int pid) {
		return productService.deleteProduct(pid);
	}
	// http://localhost:8080/findProduct 
	@RequestMapping(value = "findProduct",
			produces =MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.GET)
	public List<Product> getAllProduct() {
		return productService.getAllProduct();
	}
}
