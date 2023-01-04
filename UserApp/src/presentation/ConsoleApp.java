package presentation;
import java.util.List;
import java.util.Scanner;

import business.IUserService;
import business.UserService;
import consumer.IUserConsumer;
import consumer.UserConsumer;
import model.User;

public class ConsoleApp {	
	
	private IUserService service;	
	
	public ConsoleApp(IUserService service) {
		this.service = service;
	}	
	
	public void run() {		
		List<User> users = service.getUsers();
		users.forEach(
				(user) -> System.out.println(user.getUsername()));		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nom d'un utilisateur pour savoir si il existe");
		String input = sc.nextLine();
		
		String result = service.checkUser(input);
		System.out.println(result);		
	}
	
	
	public static void main(String[] args) {		
		System.out.println("Bienvenue dans l'application UserApp");
		
		IUserConsumer consumer = new UserConsumer();
		IUserService service = new UserService(consumer);		
		ConsoleApp app = new ConsoleApp(service);
		app.run();		
	}
}
