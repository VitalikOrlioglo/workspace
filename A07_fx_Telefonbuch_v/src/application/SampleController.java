package application;

import com.sun.javafx.image.impl.ByteIndexed.Getter;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Telefonbuch;
import model.TelefonbuchImpl;

public class SampleController {
	
	// Instanz variablen
	private TelefonbuchImpl tel;

	// fx
    @FXML
    private TextField nameEntryField;

    @FXML
    private TextField nummerEntryField;

    @FXML
    private TextField nameSucheField;

    @FXML
    private Label labelSuche;

    @FXML
    private Label infoLabel;
    
    
    
    
    public SampleController() {
	}

	@FXML
    void initialize() {
    	System.out.println("init . . .");
    	tel = new TelefonbuchImpl();
    	
    	tel.eintrag("Max", "111");
    	tel.eintrag("Andrew", "222");
    	tel.eintrag("Otto", "333");
    	infoLabel.setText(tel.getMap()+"");
    }

    @FXML
    void entryAction(ActionEvent event) {
//    	Button b= (Button) event.getSource();
    	tel.eintrag(nameEntryField.getText(), nummerEntryField.getText());
    	infoLabel.setText(tel.getMap()+"");
    }

    @FXML
    void searchAction(ActionEvent event) {
    	labelSuche.setText(tel.findeNummer(nameSucheField.getText()));
    }

}
