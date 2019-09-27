package application;

import java.io.File;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.stage.DirectoryChooser;

public class ImageViewController {

	@FXML
	TilePane images;

	@FXML
	public void open() {
//		DirectoryChooser dc = new DirectoryChooser();
//		File file = dc.showDialog(null);
//		String url = "file:///"+file.getAbsolutePath();
//		ImageView iv = new ImageView(new Image(url));
//		images.getChildren().add(iv);
		String url = "file:///C:/Users/Student/Desktop/bilder_gross/A_Gift_of_Moonlight.jpg";
		ImageView iv = new ImageView(new Image(url));
		iv.setFitWidth(100);
		iv.setPreserveRatio(true);
//		System.out.println(file.getAbsolutePath());
	}

	@FXML
	public void exit() {
		Platform.exit();
	}
	
}
