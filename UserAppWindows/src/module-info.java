module UserAppWindows {
	requires javafx.controls;
	requires UserAppBusiness;
	
	opens application to javafx.graphics, javafx.fxml;
}
