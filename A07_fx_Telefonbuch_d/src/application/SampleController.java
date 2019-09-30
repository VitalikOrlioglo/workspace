package application;

import javafx.fxml.FXML;
import model.Telefonbuch;
import model.TelefonbuchImpl;

public class SampleController {
	
	private Telefonbuch tel;
	
	
	@FXML
	void initialize() {
		System.out.println("init...");
		tel = new TelefonbuchImpl();
	}
	
}
