package application;

import java.io.File;

import io.FileHandler;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.TilePane;
import javafx.stage.DirectoryChooser;
import javafx.scene.control.Slider;

public class ImageViewerController {



    @FXML
    private TilePane thumbnailPane;

    @FXML
    private ImageView mainImageView;

	@FXML 
	private Slider sizeSlider;

	@FXML 
	private Slider opacitySlider;

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
//    	sizeSlider.valueProperty().addListener(new ChangeListener<Number>() {
//
//			@Override
//			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//				// TODO Auto-generated method stub
//				
//			}
//		} );
    	
    	// Listener, Binding und Listener sind am wichtigste sachen
    	sizeSlider.valueProperty().addListener( (a,b,newValue)->{
//    		System.out.println(newValue.doubleValue());
    		double d = Math.round(newValue.doubleValue());
    		d = d == 0?1.0:d;
    		System.out.println(d);
    		mainImageView.setFitWidth(d);
    		
    	} );
    	
    	// Binding, setMethode und exception nicht darf
    	mainImageView.opacityProperty().bind(opacitySlider.valueProperty());

    }
}
