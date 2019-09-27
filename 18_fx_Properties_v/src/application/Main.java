package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Temperatur t = new Temperatur();
			Button b1 = new Button("+1");
			b1.setOnAction(e->{
				t.setGrad(t.getGrad()+0.1f);
			});
			
			Button b2 = new Button("-1");
			// lambda
			b2.setOnAction(e->{
				t.setGrad(t.getGrad()-0.1f);
			});
			
			// anonymer typ
//			b2.setOnAction(new EventHandler<ActionEvent>() {
//				
//				@Override
//				public void handle(ActionEvent event) {
//					t.setGrad(t.getGrad()-0.1f);
//				}
//			});
			
			
			//////////////////////////////////////
			ProgressBar pb = new ProgressBar();
			// Binding
			pb.progressProperty().bind(t.gradProperty());
			
			// Listener
//			t.gradProperty().addListener((a,b,newValue)->{
//				pb.setProgress(newValue.doubleValue());
//			});
			
			root.setLeft(b1);
			root.setRight(b2);
			root.setTop(pb);
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
