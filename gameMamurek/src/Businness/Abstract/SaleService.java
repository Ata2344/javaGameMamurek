package Businness.Abstract;

import Entities.Concrete.Campaing;
import Entities.Concrete.User;
import Entities.Concrete.Product;

public interface SaleService {
	void sale(Product product, Campaing campaign, User user);

}