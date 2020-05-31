package com.opensource.service;

import java.util.List;

import com.opensource.model.Product;

public interface ProductService {

	List<Product> loadProducts();
	List<Product> loadProducts(long categoryId);
	Product findOne(long id);
}
