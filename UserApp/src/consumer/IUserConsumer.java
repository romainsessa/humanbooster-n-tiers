package consumer;

import java.util.List;

import model.User;

public interface IUserConsumer {

	public List<User> findAll();
	
	public boolean exists(String username);
	
}
