import business.ProductManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.HibernateProductDao;
import dataAccess.JdbcProductDao;
import entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Product product1=new Product(1,"Mercedes Clx",780000);
		Product product2=new Product(2,"Bmw f50",650000);
		Product product3=new Product(3,"Honda S200",700000);
		Product product4=new Product(4,"Rangerover long",530000);
		
		Logger[] loggers= {new DatabaseLogger(), new FileLogger()};
		
		
		ProductManager productManager=new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);
		productManager.delete(product4);
		productManager.delete(product1);
		productManager.update(product4);

	}

}
