package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	
	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}
	
	public String storeProduct(Product product) {
		boolean res = productRepository.existsById(product.getPid());
		if(res) {
			return "Product didn't store";
		}else {
			productRepository.save(product);
			return "Product record stored successfully";
		}
	}
}


