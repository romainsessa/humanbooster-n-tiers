package com.hb.userapp.presentation;

import java.util.List;

import com.hb.userapp.business.UserService;

public class ConsoleApp {	
	
	public static void main(String[] args) {
		ConsoleApp app = new ConsoleApp();
		app.run();
	}	
	
	public void run() {		
		UserService service = new UserService();
		List<String> result = service.getUsers();
		result.forEach((user) -> System.out.println(user));		
	}

}
