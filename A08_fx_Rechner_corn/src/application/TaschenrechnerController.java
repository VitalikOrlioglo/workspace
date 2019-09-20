package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import rechner.Rechner;

public class TaschenrechnerController {
	Rechner rechner=new Rechner();
	
    @FXML
    private TextField txt_Rechner;

    @FXML
    void ParseButtonValue(ActionEvent event) {
    	Button b= (Button) event.getSource();
    	switch (b.getText()) {
    	case "C":txt_Rechner.setText("");break;
    	case "=":txt_Rechner.setText(txt_Rechner.getText() + " = " + rechner.rechne(txt_Rechner.getText()));break;
    	case ",": //bei Komma wird das Komma in die Anzeige eingetragen und in die Berechnung 
    	default : txt_Rechner.setText(txt_Rechner.getText() +" "+b.getText());break;
    	}
    }

}
