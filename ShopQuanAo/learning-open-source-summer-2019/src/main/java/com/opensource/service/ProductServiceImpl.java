package com.opensource.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opensource.model.Product;
import com.opensource.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> loadProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product findOne(long id) {
		return productRepository.getOne(id);
	}

	@Override
	public List<Product> loadProducts(long categoryId) {
		return productRepository.listProducts();
	}

	
}
