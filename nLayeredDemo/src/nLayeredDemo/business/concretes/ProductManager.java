package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private LoggerService loggerService;

	// bu þekilde hibernate e baðlý deðilsin. Ama onun referansýný tutabilirsin
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		// iþ kodlarý
		if (product.getCategoryId() == 1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}
		/*
		 * HibernateProductDao dao = new HibernateProductDao(); dao.add(product);//
		 * çalýþýr ama doðru deðil. Alternatif bir sistem dahil edilemez.
		 */
		this.productDao.add(product); // Doðru kullaným
		this.loggerService.logToSystem("Ürün eklendi " + product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
