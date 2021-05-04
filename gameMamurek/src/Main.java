import Businness.Concrete.CampaingManager;

import Businness.Concrete.UserManager;
import Businness.Concrete.ProductManager;
import Businness.Concrete.SaleManager;
import Entities.Concrete.Campaing;
import Entities.Concrete.User;
import Entities.Concrete.Product;

import java.util.Date;

import Adapters.MernisServiceAdapter;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Campaing gorgeousFriday = new Campaing(1, "Muhteşem Cuma!", "friday10", 10.0,
				"Muhteşem Cuma indirimleri başladı. Sana özel % 10 indirim.");

		Campaing blackFriday = new Campaing(2, "Kara Cuma!", "blackFriday5", 5.0,
				"Muhteşem Cuma indirimleri başladı. Sana özel % 5 indirim.");
		
		
		User user1 = new User(1, "A.t.a.2344", "Ahmet Turan", "Aydın", "Ahmetaydn3@gmail.com", "pass", "42775686222", new Date(1997, 1, 1), "blackFriday5");
		
		User user2 = new User(2, "S.f.k.3944", "Seyit Fehmi", "Korkmaz", "krkmz394@gmail.com", "pass", "47586826482", new Date(1999, 1, 1), "friday10");
		
		User user3 = new User(3, "msaladag", "Sezer", "Aladağ", "msaladag@gmail.com", "adfa", "42728292326", new Date(1993,1,1), "blackFriday5");

				
		Product csGo = new Product(1, "Counter-Strike Global Offensive", 14.99);
		Product theForest = new Product(2, "The Forest", 15.85);

		ProductManager productManager = new ProductManager();

		Product[] products = { csGo, theForest };
		for (Product product : products) {
			productManager.add(product);
		}

		System.out.println("**************************////**************************");

		CampaingManager campaingManager = new CampaingManager();
		Campaing[] campaings = { blackFriday, gorgeousFriday };
		for (Campaing campaing : campaings) {
			campaingManager.add(campaing);
		}

		System.out.println("**************************////**************************");

		UserManager userManager = new UserManager(new MernisServiceAdapter());
		User[] users = { user1,user2,user3 };
		for (User user : users) {
			userManager.add(user);
		}

		System.out.println("**************************////**************************");

		userManager.delete(user2);
		userManager.update(user3);
		
		System.out.println("**************************////**************************");
		

		SaleManager saleManager = new SaleManager();
		
		saleManager.sale(csGo, blackFriday, user1);
		saleManager.sale(csGo, gorgeousFriday, user2);
		saleManager.sale(theForest, gorgeousFriday, user3);
		
		

		System.out.println("**************************////**************************");
		
		campaingManager.delete(blackFriday);
		productManager.delete(csGo);
		productManager.update(theForest);

	}

}