package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

//i� s�n�f�n�n interface'i Service
public interface ProductService {
	void add(Product product);

	List<Product> getAll();
}
