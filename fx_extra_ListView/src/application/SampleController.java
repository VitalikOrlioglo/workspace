package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

public class SampleController {


    @FXML
    private Label label;

    @FXML
    private ListView<Song> listView;

    @FXML
    void initialize() {
	
	ObservableList<Song> songList = FXCollections.observableArrayList();
	songList.add(new Song("Hurt", "Johnny Cash"));
	songList.add(new Song("Enter Sandman", "Metalica"));
	songList.add(new Song("Billy Talent", "Fallen Leaves"));
	songList.add(new Song("Mumford & Sons", "I will ait"));
	
	listView.setItems(songList);
	
	
	listView.getSelectionModel().selectedItemProperty().addListener((a,b,newValue)->{
	    label.setText(newValue.toString());
	});

    
    }
}
