package Businness.Concrete;

import Businness.Abstract.SaleService;
import Entities.Concrete.Campaing;
import Entities.Concrete.User;
import Entities.Concrete.Product;

public class SaleManager implements SaleService {

	@Override
	public void sale(Product product, Campaing campaign, User user) {
		if (user.getCampaignCode() == campaign.getCampaingCode()) {

			Double newUnitPrice = product.getUnitPrice()
					- (product.getUnitPrice() * campaign.getDiscountRate() / 100);

			System.out.println(user.getUserName() + " "+product.getName() + " % " + campaign.getDiscountRate().intValue() + " İndirimle "
					+ product.getUnitPrice()+" Yerine "   + newUnitPrice + " TL ye satın alındı.");
		} else {
			System.out.println(user.getUserName() +" "+product.getName() +" " + product.getUnitPrice()+" TL");
		}

	}

}