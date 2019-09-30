package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Telefonbuch;
import model.TelefonbuchImpl;

public class TelefonbuchController {

	
	// Member
	private TelefonbuchImpl tel;
	
	
	//fx
	@FXML
	private Label infoLabel;
	@FXML
	private TextField nameEntryField;
	@FXML
	private TextField numberEntryField;
	@FXML
	private Label findLabel;
	@FXML
	private TextField nameSearchField;
	
	


	@FXML  
	void initialize() {
 		System.out.println("init...");
		tel = new TelefonbuchImpl();
		
		tel.eintrag("Max", "123");
		tel.eintrag("Ina", "1111");
		tel.eintrag("Otto", "2222");
		infoLabel.setText(tel.getMap()+"");
	}

	@FXML
	public void entryAction(ActionEvent event) {
		
		tel.eintrag(nameEntryField.getText(), numberEntryField.getText());
		infoLabel.setText(tel.getMap()+"");
		
	}

	@FXML
	public void searchAction(ActionEvent event) {
		findLabel.setText(tel.findeNummer(nameSearchField.getText()));
	}

//	@Override
//	public void initialize(URL location, ResourceBundle resources) {
//		System.out.println("init2");
//		
//	}

}
