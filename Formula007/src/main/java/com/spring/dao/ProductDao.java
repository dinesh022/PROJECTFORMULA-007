package com.spring.dao;

import java.util.List;

import com.spring.model.Product;

public interface ProductDao {
    
	 void addProduct(Product product);
	 
	 Product getProductById(String id);
	 List<Product> getAllProducts();
	 
	 void deleteProduct(String id);
}
