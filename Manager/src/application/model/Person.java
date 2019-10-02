package application.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Класс-модель (Person).
 * Student
 * @author vitali orlioglo
 * 02.10.2019
 * Manager
 */
public class Person {
	// In JavaFX werden Properties ständig für alle  Eigenschaften der Modellklasse verwendet.
	private StringProperty firstName;
    private StringProperty lastName;
    private StringProperty street;
    private IntegerProperty postalCode;
    private StringProperty city;
    private ObjectProperty<LocalDate> birthday;
    
    public Person() {
    	this(null, null);
    }
    
    /**
     * Конструктор с некоторыми начальными данными.
     * @param firstName
     * @param lastName
     */
	public Person(String firstName, String lastName) {
//		super();
		this.firstName = new SimpleStringProperty(firstName);
		this.lastName = new SimpleStringProperty(lastName);
		
		// Какие-то фиктивные начальные данные для удобства тестирования.
//        this.street = new SimpleStringProperty("какая-то улица");
//        this.postalCode = new SimpleIntegerProperty(1234);
//        this.city = new SimpleStringProperty("какой-то город");
//        this.birthday = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
	}

	public final StringProperty firstNameProperty() {
		return this.firstName;
	}
	

	public final String getFirstName() {
		return this.firstNameProperty().get();
	}
	

	public final void setFirstName(final String firstName) {
		this.firstNameProperty().set(firstName);
	}
	

	public final StringProperty lastNameProperty() {
		return this.lastName;
	}
	

	public final String getLastName() {
		return this.lastNameProperty().get();
	}
	

	public final void setLastName(final String lastName) {
		this.lastNameProperty().set(lastName);
	}
	

	public final StringProperty streetProperty() {
		return this.street;
	}
	

	public final String getStreet() {
		return this.streetProperty().get();
	}
	

	public final void setStreet(final String street) {
		this.streetProperty().set(street);
	}
	

	public final IntegerProperty postalCodeProperty() {
		return this.postalCode;
	}
	

	public final int getPostalCode() {
		return this.postalCodeProperty().get();
	}
	

	public final void setPostalCode(final int postalCode) {
		this.postalCodeProperty().set(postalCode);
	}
	

	public final StringProperty cityProperty() {
		return this.city;
	}
	

	public final String getCity() {
		return this.cityProperty().get();
	}
	

	public final void setCity(final String city) {
		this.cityProperty().set(city);
	}
	

	public final ObjectProperty<LocalDate> birthdayProperty() {
		return this.birthday;
	}
	

	public final LocalDate getBirthday() {
		return this.birthdayProperty().get();
	}
	

	public final void setBirthday(final LocalDate birthday) {
		this.birthdayProperty().set(birthday);
	}
	
	
}
