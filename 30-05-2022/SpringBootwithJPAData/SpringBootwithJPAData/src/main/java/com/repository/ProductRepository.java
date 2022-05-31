package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	@Query("select p from Product p where p.price > :price")
	public List<Product> findProductByPrice(@Param("price") float price);
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("delete from Product p where p.pname = :pname")
	public int deleteProductByName(@Param("pname") String pname);
}
