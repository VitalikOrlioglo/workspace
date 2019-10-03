package application.view;

import application.model.Person;
import application.util.DateUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Окно для изменения информации об адресате.
 */
public class PersonEditController {

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField streetField;

    @FXML
    private TextField cityField;

    @FXML
    private TextField postalCodeField;

    @FXML
    private TextField birthdayField;

    private Stage editStage;
    private Person person;
    private boolean okClicked = false;

    /**
     * Устанавливает сцену для этого окна.
     * @param editStage
     */
    public void setEditStage(Stage editStage) {
        this.editStage = editStage;
    }

    /**
     * Задаёт адресата, информацию о котором будем менять.
     * @param person
     */
    public void setPerson(Person person) {
        this.person = person;
        firstNameField.setText(person.getFirstName());
        lastNameField.setText(person.getLastName());
        streetField.setText(person.getStreet());
        cityField.setText(person.getCity());
        postalCodeField.setText(Integer.toString(person.getPostalCode()));
        birthdayField.setText(DateUtil.formatDate(person.getBirthday()));
        birthdayField.setPromptText("dd.mm.yyyy");
    }

    /**
     * Returns true, если пользователь кликнул OK, в другом случае false.
     * @return
     */
    public boolean isOkClicked() {
//        System.out.println("okClicked = " + okClicked);
        return okClicked;
    }

    /**
     * Вызывается, когда пользователь кликнул по кнопке Cancel.
     * @param event
     */
    @FXML
    void cancelButton(ActionEvent event) {
        editStage.close();
    }

    /**
     * Вызывается, когда пользователь кликнул по кнопке OK.
     * @param event
     */
    @FXML
    void okButton(ActionEvent event) {
        person.setFirstName(firstNameField.getText());
        person.setLastName(lastNameField.getText());
        person.setStreet(streetField.getText());
        person.setCity(cityField.getText());
        person.setPostalCode(Integer.parseInt(postalCodeField.getText()));
        // TODO: нужен способ для перевода String в localDate
//        person.setBirthday(LocalDate.parse(birthdayField.getText(), DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        person.setBirthday(DateUtil.parseDate(birthdayField.getText()));

        okClicked = true;
        editStage.close();
//        editStage.show();
    }

    @FXML
    void initialize() {}
}
