package application.view;

import application.Main;
import application.model.Person;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import javafx.scene.control.TableColumn.CellDataFeatures;

public class PersonOverviewController {

    @FXML
    private TableView<Person> personTable;

    @FXML
    private TableColumn<Person, String> firstNameColumn;

    @FXML
    private TableColumn<Person, String> lastNameColumn;

    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private Label streetLabel;

    @FXML
    private Label cityLabel;

    @FXML
    private Label postalCodeLabel;

    @FXML
    private Label birthdayLabel;
    
    // Ссылка на главное приложение.
    private Main main;
    /**
     * Конструктор вызывается раньше метода initialize().
     */
    public PersonOverviewController() {}
    
    /**
     * Инициализация класса-контроллера. Этот метод вызывается автоматически
     * после того, как fxml-файл будет загружен.
     */
    @FXML
    void initialize() {
    	// Инициализация таблицы адресатов с двумя столбцами с помощью лямбд.
    	firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
    	lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());

//    	anonymer typ
//    	lastNameColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Person,String>, ObservableValue<String>>() {
//			
//			@Override
//			public ObservableValue<String> call(CellDataFeatures<Person, String> cell) {
//				// cell.getValue() returns the Person instance for a particular TableView row
//				return cell.getValue().lastNameProperty();
//			}
//		});
    	
    	// mit PropertyValueFactory
//    	lastNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
    }
    
    /**
     * Вызывается главным приложением, которое даёт на себя ссылку.
     * @param main
     */
    public void setMain(Main main) {
    	this.main = main;
    	
    	// Добавление в таблицу данных из наблюдаемого списка
    	personTable.setItems(main.getPersonData());
    }
}
