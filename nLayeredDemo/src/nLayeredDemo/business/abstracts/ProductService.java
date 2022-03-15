package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

//iþ sýnýfýnýn interface'i Service
public interface ProductService {
	void add(Product product);

	List<Product> getAll();
}
