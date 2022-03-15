package com.mustafayilmazdev.nLayeredDemoTekrar.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mustafayilmazdev.nLayeredDemoTekrar.business.abstracts.ProductService;
import com.mustafayilmazdev.nLayeredDemoTekrar.entities.concretes.Product;

@RestController
@RequestMapping("/api/productstekrar")
public class ProductController {

	ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public List<Product> getAll() {
		return this.productService.getAll();
	}

}
