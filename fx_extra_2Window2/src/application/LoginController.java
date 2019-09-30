package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
	@FXML
	private TextField loginTextField;

	@FXML
	public void loginAction(ActionEvent event) {

		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));

			Parent mainRoot = (Parent) loader.load();
			
			MainController mainController =  loader.getController();
			mainController.setMessage(loginTextField.getText());
			 
			Scene mainScene = new Scene(mainRoot);
			Stage mainStage = new Stage();
			mainStage.show();
			mainStage.setScene(mainScene);

			if (mainStage.isShowing()) {
				Stage stage = (Stage) loginTextField.getScene().getWindow();
				stage.close();
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
