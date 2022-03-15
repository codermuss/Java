package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private LoggerService loggerService;

	// bu �ekilde hibernate e ba�l� de�ilsin. Ama onun referans�n� tutabilirsin
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		// i� kodlar�
		if (product.getCategoryId() == 1) {
			System.out.println("Bu kategoride �r�n kabul edilmiyor");
			return;
		}
		/*
		 * HibernateProductDao dao = new HibernateProductDao(); dao.add(product);//
		 * �al���r ama do�ru de�il. Alternatif bir sistem dahil edilemez.
		 */
		this.productDao.add(product); // Do�ru kullan�m
		this.loggerService.logToSystem("�r�n eklendi " + product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
