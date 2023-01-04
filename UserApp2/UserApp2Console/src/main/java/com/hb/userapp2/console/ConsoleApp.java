package com.hb.userapp2.console;

import java.util.List;

import com.hb.userapp2.business.UserService;

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
