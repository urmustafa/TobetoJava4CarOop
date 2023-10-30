package dataAccess;

import entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		//sql ile
		System.out.println(product.getName()+ " Modelli Aracımız Hibernate veri tabanına eklendi");
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getName()+ " Modelli Aracımız Hibernate veri tabanından silindi");
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getName()+ " Modelli Aracımız Hibernate veri tabanında güncellendi");
		
		
	}
}
