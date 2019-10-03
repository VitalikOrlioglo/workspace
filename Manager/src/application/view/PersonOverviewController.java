package application.view;

import application.Main;
import application.model.Person;
import application.util.DateUtil;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import javafx.scene.control.TableColumn.CellDataFeatures;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

        // Очистка дополнительной информации об адресате.
        showPersonDetails(null);

        // Слушаем изменения выбора, и при изменении отображаем
        // дополнительную информацию об адресате, лямбда
        personTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> showPersonDetails(newValue));
        // anonymer typ
//        personTable.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Person>() {
//            @Override
//            public void changed(ObservableValue<? extends Person> observable, Person oldValue, Person newValue) {
//                showPersonDetails(newValue);
//            }
//        });
    }

    /**
     * Вызывается когда пользователь кликает по кнопке удаления
     * getSelectedIndex возвращает -1, если в таблице ничего не выделено
     */
    @FXML
    private void deleteButton() {
        int selectedIndex = personTable.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            personTable.getItems().remove(selectedIndex);
        } else {
            // Ничего не выбрано
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.initOwner(main.getprimaryStage());
            alert.setTitle("Keine Auswahl");
            alert.setHeaderText("Keine Person ausgewählt");
            alert.setContentText("Bitte wählen Sie eine Person in der Tabelle aus");
            alert.showAndWait();
        }
    }

    /**
     * - Вызывается, когда пользователь кликает по кнопке New...
     * - Открывает диалоговое окно с дополнительной информацией нового адресата
     */
    @FXML
    private void newButton() {
        Person newPerson = new Person();
        boolean okClicked = main.showPersonEdit(newPerson);
        if (okClicked) {
            main.getPersonData().add(newPerson);
        }
    }

    /**
     * - Вызывается, когда пользователь кликает по кнопка Edit...
     * - Открывает диалоговое окно для изменения выбранного адресата.
     */
    @FXML
    private void editButton() {
        Person editPerson = personTable.getSelectionModel().getSelectedItem();
        if (editPerson != null) {
            boolean okClicked = main.showPersonEdit(editPerson);
            if (okClicked) {
                showPersonDetails(editPerson);
            }
        } else {
            // Ничего не выбрано
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.initOwner(main.getprimaryStage());
            alert.setTitle("Keine Auswahl");
            alert.setHeaderText("Keine Person ausgewählt");
            alert.setContentText("Bitte wählen Sie eine Person in der Tabelle aus");
            alert.showAndWait();
        }
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

    /**
     * - Заполняет все текстовые поля, отображая подробности об адресате.
     * - Если указанный адресат = null, то все текстовые поля очищаются.
     * @param person - адресат типа Person или null
     */
    private void showPersonDetails(Person person) {
        if (person != null) {
            // Заполняем метки информацией из объекта person.
            firstNameLabel.setText(person.getFirstName());
            lastNameLabel.setText(person.getLastName());
            streetLabel.setText(person.getStreet());
            postalCodeLabel.setText(Integer.toString(person.getPostalCode()));
            cityLabel.setText(person.getCity());
            // TODO: нужен способ для перевода LocalDate в String
            birthdayLabel.setText(DateUtil.formatDate(person.getBirthday()));
//             birthdayLabel.setText(DateTimeFormatter.ofPattern("dd.MM.yyyy").format(person.getBirthday()));
        } else {
            // Если Person = null, то убираем весь текст.
            firstNameLabel.setText("");
            lastNameLabel.setText("");
            streetLabel.setText("");
            postalCodeLabel.setText("");
            cityLabel.setText("");
            birthdayLabel.setText("");
        }
    }

}
