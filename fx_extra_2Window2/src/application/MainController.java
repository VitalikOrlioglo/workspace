package application;

import javafx.fxml.FXML;

import javafx.scene.control.Label;

public class MainController {
	@FXML
	private Label welcomeLabel;
	
	
	
	public void setMessage(String msg) {
		welcomeLabel.setText(msg);
	}
	
	
	

}
