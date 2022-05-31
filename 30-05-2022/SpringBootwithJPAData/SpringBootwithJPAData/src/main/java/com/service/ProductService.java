package com.service;

import java.util.List;
import java.util.Optional;

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
	
	public String updateProduct(Product product) {
			Optional<Product> op	= productRepository.findById(product.getPid());
			if(op.isPresent()) {
				Product p = op.get();
				p.setPrice(product.getPrice());
				productRepository.saveAndFlush(p);
				return "Product updated successfully";
			}else {
				return "Product not present";
			}
	}
	
	public String deleteProduct(int pid) {
		Optional<Product> op	= productRepository.findById(pid);
		if(op.isPresent()) {
			Product p = op.get();
			productRepository.delete(p);
			return "Product deleted successfully";
		}else {
			return "Product not present";
		}
	}
	
	public Product findProductById(int pid) {
		Optional<Product> op	= productRepository.findById(pid);
		if(op.isPresent()) {
			Product p = op.get();
			return p;
		}else {
			return null;
		}
	}
	
	public List<Product> findProductByPrice(float price){
		return productRepository.findProductByPrice(price);
	}
	
	public String deleteProductByName(String pname) {
		if(productRepository.deleteProductByName(pname)>0) {
			return "Record deleted successfully";
		}else {
			return "Record didn't delete";
		}
	}
	
}


