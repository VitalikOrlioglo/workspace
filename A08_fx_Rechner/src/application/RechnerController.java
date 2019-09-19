package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RechnerController {

    @FXML
    private TextField inout;
    
    @FXML
    private Button number;
    
	@FXML
    void initialize() {
    	System.out.println("init . . .");
    	inout.setText(number.getText());
    }

    @FXML
    void clear(ActionEvent event) {
    	inout.setText("");
    }

    @FXML
    void divide(ActionEvent event) {

    }

    @FXML
    void equal(ActionEvent event) {

    }

    @FXML
    void minus(ActionEvent event) {

    }

    @FXML
    void multiply(ActionEvent event) {

    }

    @FXML
    void number(ActionEvent event) {
    	Button b = (Button) event.getSource();
    	String s = b.getText();
    }

    @FXML
    void plus(ActionEvent event) {
//    	Button b = (Button) event.getSource();
//    	String s = b.getText();
    	
    }

}
