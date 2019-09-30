package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;

public class MainController{

	@FXML
	Pane content;

	@FXML
	Label label1;

	@FXML
	private void showView2() {

		try {
			
			System.out.println("content"+content);
			content.getChildren().clear();
			Pane p = FXMLLoader.load(getClass().getResource("View2.fxml"));
			label1 = (Label) p.lookup("#label1");
			content.getChildren().add(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	private void showView3() {
		try {
			content.getChildren().clear();

			content.getChildren().add(
					FXMLLoader.load(getClass().getResource("View3.fxml")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	



	
	public void initialize() {
		// TODO Auto-generated method stub
		System.out.println("init MainController");
		
	}

	@FXML public void delete(ActionEvent event) {
		content.getChildren().clear();
	}

}
