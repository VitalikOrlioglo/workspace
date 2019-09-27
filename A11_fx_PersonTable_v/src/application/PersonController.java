package application;

import java.time.LocalDate;
import java.time.Month;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PersonController {
	@FXML
    private TableView<Person> tableView;
	
    @FXML
    private TableColumn<Person, String> vornameCol;

    @FXML
    private TableColumn<Person, String> nachnameCol;

    @FXML
    private TableColumn<Person, LocalDate> geburtsdatumCol;

    @FXML
    private TextField vorname;

    @FXML
    private TextField nachname;

    @FXML
    private DatePicker datePicker;

//    ObservableList<Person> list = FXCollections.observableArrayList();
    
//    @FXML
//    void save(ActionEvent event) {
//    	System.out.println("init");
//    	
//    	list.add(new Person(vorname.getText(), nachname.getText(), datePicker.getValue()));
//    	vorname.setText("");
//    	nachname.setText("");
//    	datePicker.setValue(null);
//    }
//    
//    @FXML
//    void initialize() {
////    	tableView.setItems(list);
//    	vornameCol.setCellValueFactory(new PropertyValueFactory<>("vorname"));// getPatternName()
//    	nachnameCol.setCellValueFactory(new PropertyValueFactory<>("nachname"));// getBeschreibung()
//    	geburtsdatumCol.setCellValueFactory(new PropertyValueFactory<>("geburtsdatum"));
//    }
    
    
    // tableView hat seine ObservableList, aber muss man noch PropertyValue in fxml schreiben
    @FXML
    void save(ActionEvent event) {
    	tableView.getItems().add(new Person(vorname.getText(), nachname.getText(), datePicker.getValue()));
    }
    
    
    /**
     * 
     */
    @FXML
    void initialize() {
    	tableView.getItems().add(new Person("Max", "Mewier", LocalDate.of(2000, Month.DECEMBER, 2)));
    }
}
