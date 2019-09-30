package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class Window2Controller {
	@FXML
	private TextField textField;

	// Event Listener on Button.onAction
	@FXML
	public void sendAction(ActionEvent event) {
		MainController maincontroller = (MainController) textField.getScene().getUserData();
		
		maincontroller.getMainLabel().setText(textField.getText());
	}
}
