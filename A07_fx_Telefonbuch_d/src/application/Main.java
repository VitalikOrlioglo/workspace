package application;
	
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application  {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setAlwaysOnTop(true);
			Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		//Platform.exit();
		launch(args);
	}
}