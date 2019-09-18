package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Telefonbuch;
import model.TelefonbuchImpl;

public class SampleController {
    @FXML
    private TextField nameEntryField;

    @FXML
    private TextField nummerEntryField;

    @FXML
    private TextField nameSucheField;

    @FXML
    private Label labelSuche;

    @FXML
    private Label labelEintrag;
	
	private Telefonbuch tel = new TelefonbuchImpl();
	
	
    @FXML
    void action(ActionEvent event) {
    	labelEintrag.setText(tel.setText(nameEntryField, nummerEntryField));
    }

	
//	@FXML
//	void initialize() {
//		System.out.println("init . . .");
//	} 
}
