package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<Song> comboBox;

    @FXML
    private Label label;

    @FXML
    void initialize() {
	ObservableList<Song> songList = FXCollections.observableArrayList();
	songList.add(new Song("Hurt", "Johnny Cash"));
	songList.add(new Song("Enter Sandman", "Metalica"));
	songList.add(new Song("Billy Talent", "Fallen Leaves"));
	songList.add(new Song("Mumford & Sons", "I will ait"));
	
	comboBox.setItems(songList);
	
	
	comboBox.getSelectionModel().selectedItemProperty().addListener((a,b,newValue)->{
	    label.setText(newValue.toString());
	});
    }
}
