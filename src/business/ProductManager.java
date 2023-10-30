package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.JdbcProductDao;
import dataAccess.ProductDao;
import entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	private Logger[] loggers;
	
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers=loggers;
	}


	public void add(Product product) throws Exception {
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün Fiyatı 10 dan küçük olamaz");
		}
		else {
			//JdbcProductDao productDao= new JdbcProductDao();
			productDao.add(product);
			
			for (Logger logger : loggers) {
				logger.log(product.getName());
			}
		}
	}
	public void delete(Product product) throws Exception{
		if (!(product.getId()==0)) {
			productDao.delete(product);
			
			for (Logger logger : loggers) {
				logger.log(product.getName());
			}

		}
		else {
			throw new Exception("İd boş olamaz");
		}
	}
	
	
	
	public void update(Product product) throws Exception {
		if (product.getId()==product.getId()) {
			productDao.update(product);
			
			for (Logger logger : loggers) {
				logger.log(product.getName());
			}
		}
		else {
			throw new Exception("id numaraları uyuşmuyor");
		}
	}
	
	
}
