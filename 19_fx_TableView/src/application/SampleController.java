package application;

import java.util.Observable;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SampleController {

    @FXML
    private TableView<Designpattern> tableView;

    @FXML
    private TableColumn<Designpattern, String> designpatternCol;

    @FXML
    private TableColumn<Designpattern, String> beschreibungCol;

    @FXML
    void initialize() {
    	System.out.println("init");
//    	Arraylist (oder andere Collection) konvertieren -> Parameter observableArrayList;
//    	ObservableList<Designpattern> list = FXCollections.observableArrayList(ARRAYLIST);
    	
    	ObservableList<Designpattern> list = FXCollections.observableArrayList();
    	designpatternCol.setCellValueFactory(new PropertyValueFactory<>("patternName"));// getPatternName()
    	beschreibungCol.setCellValueFactory(new PropertyValueFactory<>("beschreibung"));// getBeschreibung()
//    	tableView.getItems();
    	
    	list.add(new Designpattern("Singleton", "nur eine Instanz"));
    	list.add(new Designpattern("MVC", "Trennung Daten/Model von View"));
    	tableView.setItems(list);
    }
}
