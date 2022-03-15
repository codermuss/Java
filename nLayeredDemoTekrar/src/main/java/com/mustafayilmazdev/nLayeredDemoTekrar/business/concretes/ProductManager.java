package com.mustafayilmazdev.nLayeredDemoTekrar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafayilmazdev.nLayeredDemoTekrar.business.abstracts.ProductService;
import com.mustafayilmazdev.nLayeredDemoTekrar.dataAccess.abstracts.ProductDao;
import com.mustafayilmazdev.nLayeredDemoTekrar.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	ProductDao productDao;

	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub

		return productDao.findAll();
	}

}
