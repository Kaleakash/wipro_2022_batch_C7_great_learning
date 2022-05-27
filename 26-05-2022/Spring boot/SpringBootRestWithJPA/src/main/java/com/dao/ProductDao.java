package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository
public class ProductDao {

	@Autowired
	EntityManagerFactory emf;		// SessionFactory sf;
	
	public boolean storeProduct(Product product) {
		try {
			EntityManager manager = emf.createEntityManager();			// like a Session object in Hibernate 
			EntityTransaction tran = manager.getTransaction();			// like a transaction 
			tran.begin();
					manager.persist(product);                           // like a session.save(product)
			tran.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return false;
		}
	}
	
	public boolean updateProduct(Product product) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Product p1 = manager.find(Product.class, product.getPid());
		if(p1==null) {
			return false;
		}else {
				tran.begin();
					p1.setPrice(product.getPrice());
					manager.merge(p1);                          //session.update(product);
				tran.commit();
			return true;
		}
	}
	public boolean deleteProduct(int pid) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Product p1 = manager.find(Product.class, pid);
		if(p1==null) {
			return false;
		}else {
				tran.begin();
					manager.remove(p1);                          //session.delete(product);
				tran.commit();
			return true;
		}
	}
	
	public List<Product> getAllProduct() {
		EntityManager manager  = emf.createEntityManager();
		Query qry = manager.createQuery("select p from Product p");				// JPQL 
		return qry.getResultList();                                        // qry.list();
	}
}
