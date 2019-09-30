package application;
	
import java.util.Optional;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			
			//----------------------------------------------------
			Parent loginRoot = FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene loginScene = new Scene(loginRoot);
			Stage loginStage = new Stage();
			loginStage.show();
			loginStage.setScene(loginScene);
			
//			if (result.isPresent()){
//			    System.out.println("Your name: " + result.get());	
//			    dialog.close();
//			    primaryStage.show();
//			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
