package Businness.Abstract;

import Entities.Concrete.User;

public interface UserCheckService {
	
	boolean checkUser(User user);
}