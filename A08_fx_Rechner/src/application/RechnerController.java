package application;

import java.util.HashMap;

import exception.BadExpressionException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import rechner.Rechner;

public class RechnerController {

    @FXML
    private TextField inout;
    
    // Member, erzeugt vor dem konstruktor
    private String expression = "";
    
    @FXML
    void buttonAction(ActionEvent event) {
    	try {
    		Button b = (Button) event.getSource();
    		String token = mapToken(b.getText());
    		if (token.equals("=")) {
				inout.setText(Rechner.rechne(expression));
				expression = "";
			}else {
				expression += token;
				inout.setText(expression);
			}
		} catch (BadExpressionException e) {
			errorMessage(e, "Fehler");
		} catch (Exception e) {
			errorMessage(e, "unbekannter Fehler!");
		}
    	
    	
    	/* bei vielen Stringoperationen optimaler -> keine neue String objekte
    	StringBuilder sb = new StringBuilder(); // bei init!
    	sb.append(b.getText());
    	expression = sb.toString(); // TODO erzeugt auch neues Objekt */
    }


	private void errorMessage(Exception e, String msg) {
		Alert a1 = new Alert(AlertType.ERROR);
		a1.setContentText("Allgemeiner Fehler: " + e.getMessage());
		a1.showAndWait();
		clear();
	}


	private void clear() {
		inout.clear();
		expression = "";
	}
	
//     initialize erzeugt nach dem konstruktor
	@FXML
    void initialize() {
		Rechner rechner = new Rechner();
    }
	
	
	public String mapToken(String s) {
		HashMap<String, String> map = new HashMap<>();
		map.put(",", ".");
		map.put(":", "/");
		return map.get(s) == null?s: map.get(s); // alle anderen Zeichen "normal" zuruckgeben
	}
	
}
