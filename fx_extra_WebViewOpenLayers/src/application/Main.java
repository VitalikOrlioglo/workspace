package application;

import java.net.URL;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {
	
	  private Scene scene;
	    MyBrowser myBrowser;
	    double lat;
	    double lon;
	    private Stage stage;

	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			this.stage = primaryStage;


	        myBrowser = new MyBrowser();
	        Scene scene = new Scene(myBrowser);

	        stage.setScene(scene);
	        stage.setWidth(1200);
	        stage.setHeight(600);
	        stage.show();
		}catch(Exception e){
			e.printStackTrace();
		}


	}

	
	 class MyBrowser extends Pane {


	        WebView webView = new WebView();
	        WebEngine webEngine = webView.getEngine();
	     


	        public MyBrowser() {
	            
//	            Document d =  webEngine.getDocument();
//	            d.getElementById(elementId)
	            
	            
	            final URL url = getClass().getResource("map.html");
	            webEngine.load(url.toExternalForm());
	            webEngine.getLoadWorker().exceptionProperty().addListener(new ChangeListener<Throwable>() {
	                @Override
	                public void changed(ObservableValue<? extends Throwable> ov, Throwable t, Throwable t1) {
	                    System.out.println("Received exception: "+t1.getMessage());
	                }
	            });
	            
//	           Document doc = webEngine.getDocument();
//	           doc.getElementById(elementId)
	            
	            getChildren().add(webView);

	            final TextField latitude = new TextField("" + 52.50591 * 1.00007);
	            final TextField longitude = new TextField("" + 13.29872 * 1.00007);
	            Button updateButton = new Button("Update");
	            updateButton.setOnAction(new EventHandler<ActionEvent>() {

	                @Override
	                public void handle(ActionEvent arg0) {
	                    lat = Double.parseDouble(latitude.getText());
	                    lon = Double.parseDouble(longitude.getText());

	                    System.out.printf("%.2f %.2f%n", lat, lon);

	                    webEngine.executeScript("" +
	                        "window.lat = " + lat + ";" +
	                        "window.lon = " + lon + ";" +
	                        "document.goToLocation(window.lat, window.lon);"
	                    );
	                }
	            });

	             
	            Button circleButton = new Button("Circle");
	            
	            circleButton.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent arg0) {

						lat = Double.parseDouble(latitude.getText());
	                    lon = Double.parseDouble(longitude.getText());
	                    int radius =160;

	                    webEngine.executeScript("" +
	                        "window.lat = " + lat + ";" +
	                        "window.lon = " + lon + ";" +
	                        "var r="+radius+";"+
	                        "document.goToLocationRadius(window.lat, window.lon,r);"
	                    );
						
						
					}
				});
	            
	            
	            
	            
	            HBox toolbar  = new HBox();
	            toolbar.getChildren().addAll(latitude, longitude, updateButton,circleButton);

	            getChildren().addAll(toolbar);

	        }
	    }
	public static void main(String[] args) {
		
		System.setProperty("java.net.useSystemProxies", "true");
		launch(args);
	}
}
