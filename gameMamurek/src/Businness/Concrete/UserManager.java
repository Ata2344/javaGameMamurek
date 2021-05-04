package Businness.Concrete;

import Businness.Abstract.BaseManagerService;
import Businness.Abstract.UserCheckService;
import Entities.Concrete.User;

public class UserManager implements BaseManagerService<User> {
	
	UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService=userCheckService;
	}
	

	@Override
	public void add(User entity) {
		
		if(userCheckService.checkUser(entity)) {
			System.out.println("Kullanıcı eklendi :"+entity.getUserName());
		} else
		{
			System.out.println("Kullanıcı bilgileri hatalı.");
		}
		
		
		
	}

	@Override
	public void delete(User entity) {
		System.out.println("Kullanıcı Silindi :"+entity.getUserName());
		
	}

	@Override
	public void update(User entity) {
		System.out.println("Kullanıcı güncellendi :"+entity.getUserName());
		
	}

}