package Businness.Concrete;

import Businness.Abstract.BaseManagerService;
import Entities.Concrete.Campaing;


public class CampaingManager implements BaseManagerService <Campaing>{

	@Override
	public void add(Campaing entity) {
		System.out.println("Kampanya Başladı : "+entity.getName() + " "+entity.getCampaingDetail());
		
	}

	@Override
	public void delete(Campaing entity) {
		System.out.println("Kampanya silindi : "+entity.getName());
		
	}

	@Override
	public void update(Campaing entity) {
		System.out.println("Kampanya güncellendi : "+entity.getName()  + " "+entity.getCampaingDetail());
		
	}

}