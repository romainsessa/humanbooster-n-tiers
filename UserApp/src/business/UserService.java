package business;

import java.util.List;

import consumer.IUserConsumer;
import model.User;

public class UserService implements IUserService {

	private IUserConsumer consumer;
	
	public UserService(IUserConsumer consumer) {
		this.consumer = consumer;
	}
	
	public List<User> getUsers() {		
		List<User> users = consumer.findAll();
		users.forEach(
				(user) -> { 
					String newUsername = user.getUsername().toUpperCase();
					user.setUsername(newUsername); 
				}
		);	
		return users;		
	}
	
	public String checkUser(String username) {		
		boolean result = consumer.exists(username);
		if(result) {
			return "trouvé";
		} else {
			return "non trouvé";
		}		
	}
}
