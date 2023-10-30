package dataAccess;

import entities.Product;

public interface ProductDao {
	 void add(Product product);
	 void delete(Product product);
	 void update(Product product);

}
