package business;

import java.util.List;

import model.User;

public interface IUserService {

	public List<User> getUsers();
	
	public String checkUser(String username);
	
}
