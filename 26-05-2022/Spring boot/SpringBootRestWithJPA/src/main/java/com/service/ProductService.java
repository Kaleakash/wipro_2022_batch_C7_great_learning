package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public String storeProduct(Product product) {
		if(productDao.storeProduct(product)) {
			return "Product stored successfully";
		}else {
			return "Product didn't store";
		}
	}
	
	public String updateProduct(Product product) {
		if(productDao.updateProduct(product)) {
			return "Product updated successfully";
		}else {
			return "Product didn't update";
		}
	}
	
	public String deleteProduct(int pid) {
		if(productDao.deleteProduct(pid)) {
			return "Product deleted successfully";
		}else {
			return "Product didn't delete";
		}
	}
	
	public List<Product> getAllProduct() {
		return productDao.getAllProduct();
	}
}
