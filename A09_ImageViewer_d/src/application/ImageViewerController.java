package application;

import java.io.File;

import io.FileHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.TilePane;
import javafx.stage.DirectoryChooser;

public class ImageViewerController {



    @FXML
    private TilePane thumbnailPane;

    @FXML
    private ImageView mainImageView;

    @FXML
    void open(ActionEvent event) {
    	thumbnailPane.getChildren().clear();
    	System.out.println("open...");
    	DirectoryChooser dc = new DirectoryChooser();
    	dc.setInitialDirectory( new File("img"));
    	File imagefile = dc.showDialog(null);
    	if(imagefile==null)return; // Abbruch
    	
    	String path = imagefile.getAbsolutePath();
    	
    	createThumbnails(path);
    }


	private void createThumbnails(String path) {
		File[] imageFiles = FileHandler.createImageFiles(path);
    	for (File imageFile : imageFiles) {
			System.out.println(imageFile);
			ImageView iv = new ImageView(new Image("file:///"+imageFile.getAbsolutePath()) );
			iv.setFitWidth(100);
			iv.setPreserveRatio(true);
			iv.addEventHandler(MouseEvent.MOUSE_CLICKED ,  e->{
				mainImageView.setImage(iv.getImage()); // new Image("file:///"+imageFile.getAbsolutePath()) 
			});
			thumbnailPane.getChildren().add(iv);
		}
	}

    
    @FXML
    void initialize() {

    }
}
