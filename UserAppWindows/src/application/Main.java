package application;
	
import java.util.List;

import com.hb.userapp.business.UserService;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			UserService service = new UserService();
			List<String> users = service.getUsers();
			
			VBox box = new VBox();
			for(String user : users) {
				Label uLabel = new Label(user);
				box.getChildren().add(uLabel);
			}
			box.setAlignment(Pos.CENTER);	
			
			Scene scene = new Scene(box,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
