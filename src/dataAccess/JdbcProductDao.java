package dataAccess;

import entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		//sql ile
		System.out.println(product.getName()+ " Modelli Aracımız Jdbc veri tabanına eklendi");
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getName()+ " Modelli Aracımız Jdbc veri tabanından silindi");
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getName()+ " Modelli Aracımız Jdbc veri tabanında güncellendi");

	}
}
