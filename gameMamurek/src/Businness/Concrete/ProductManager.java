package Businness.Concrete;

import Businness.Abstract.BaseManagerService;
import Entities.Concrete.Product;

public class ProductManager implements BaseManagerService<Product> {

	@Override
	public void add(Product entity) {
		System.out.println("Ürün eklendi : "+entity.getName());
		
	}

	@Override
	public void delete(Product entity) {
		System.out.println("Ürün Silindi : "+entity.getName());
		
	}

	@Override
	public void update(Product entity) {
		
		
		System.out.println("Ürün güncellendi : "+entity.getName());
		
		
	}

}