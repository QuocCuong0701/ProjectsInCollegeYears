package com.opensource.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.opensource.model.Product;
import com.opensource.service.CategoryService;
import com.opensource.service.ProductService;

@Controller
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

//	@GetMapping("/shop")
//	public String shop(Model model) {
//		model.addAttribute("category_name", categoryService.loadCategory());
//		return "web/shop";
//	}

	// Load danh sach san pham
	@Autowired
	private ProductService productService;

	@GetMapping("/shop")
	public String loadProducts(Model model, @RequestParam(name = "categoryId") long categoryId,
			@RequestParam(name = "id") long id) {
		Product product = productService.findOne(id);
		String name = product.getName();
		model.addAttribute("product_name", name);
		model.addAttribute("category_name", categoryService.loadCategory());
		model.addAttribute("products", productService.loadProducts(categoryId));
		
		return "web/shop";
	}
}
