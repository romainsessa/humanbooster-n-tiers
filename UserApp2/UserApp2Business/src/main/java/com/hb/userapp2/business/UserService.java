package com.hb.userapp2.business;

import java.util.ArrayList;
import java.util.List;

import com.hb.userapp2.consumer.UserConsumer;

public class UserService {

	public List<String> getUsers() {
		
		UserConsumer consumer = new UserConsumer();
		
		List<String> users = consumer.findAll();
		List<String> result = new ArrayList<>();
		
		users.forEach((user) -> result.add("_#"+user.toUpperCase()));
		
		return result;		
	}
	
}
