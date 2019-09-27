package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			TilePane root = new TilePane();
			Scene scene = new Scene(root,400,400);
			ImageView iv = new ImageView(new Image("file:///C:/Users/Student/Desktop/bilder_gross/A_Gift_of_Moonlight.jpg"));// String als URL
			
			iv.setFitWidth(100);
			iv.setPreserveRatio(true);
			
			Button b = new Button("Test");
			
			//anonymer type
			b.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {	
					root.setStyle("-fx-background-color:red");
				}
			});
			
			//anonymer type
//			iv.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {
//
//				@Override
//				public void handle(Event event) {
//					// TODO Auto-generated method stub
//					
//				}
//			});
			
			//lambda
			iv.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
				root.setStyle(null);
			} );
			
			
			root.getChildren().add(iv);
			root.getChildren().add(b);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
