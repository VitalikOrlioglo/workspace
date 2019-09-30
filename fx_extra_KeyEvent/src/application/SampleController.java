package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;

public class SampleController {

	@FXML
	private TextField textField;

	@FXML
	private Label label;

	@FXML
	public void keyPress(KeyEvent event) {
		System.out.println(event.getCode());
		KeyCode c = event.getCode();
		label.setText(label.getText() + c.getChar());
//		TextField  textfield = (TextField) event.getSource();
//		textfield.requestFocus();
		
		if(c == KeyCode.ENTER) {
			System.out.println("enter");
		}

	}

}
