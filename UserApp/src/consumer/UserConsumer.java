package consumer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserConsumer implements IUserConsumer {

	public List<User> findAll() {
		
		List<User> users = new ArrayList<>();
		try {
			FileReader reader = new FileReader(new File("users.txt"));
			BufferedReader buff = new BufferedReader(reader);
			String line;
			while((line = buff.readLine()) != null) {
				User user = new User(line);
				users.add(user);
			}		
			buff.close();
			reader.close();
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
			System.err.println("Error reading file");
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Error reading file");
		}		
		return users;		
	}

	@Override
	public boolean exists(String username) {
		boolean result = false;
		
		try {
			FileReader reader = new FileReader(new File("users.txt"));
			BufferedReader buff = new BufferedReader(reader);
			String line;
			while((line = buff.readLine()) != null) {
				if(line.equals(username)) {
					result = true;
					break;
				}
			}
			buff.close();
			reader.close();			
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
			System.err.println("Error reading file");
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Error reading file");
		}		
		
		return result;
	}
	
}