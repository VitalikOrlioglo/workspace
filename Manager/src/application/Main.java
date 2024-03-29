package application;
	
import java.io.IOException;

import application.model.Person;
import application.view.PersonEditController;
import application.view.PersonOverviewController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private Stage primaryStage;
    private BorderPane rootLayout;
    private AnchorPane personOverview;
    /**
     * Данные, в виде наблюдаемого списка адресатов.
     */
    private ObservableList<Person> personData = FXCollections.observableArrayList();
    public Main() {
    	// В качестве образца добавляем некоторые данные
//    	personData.add(new Person("Koziol", "Kozlov"));
//    	personData.add(new Person("Baran", "Baranovici"));
	}
    
    public ObservableList<Person> getPersonData() {
    	return personData;
    }
    
    
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Manager");
		initRootLayout();
		showPersonOverview();
	}
	
	
	/**
	 * Инициализирует корневой макет.
	 */
	public void initRootLayout() {
		try {
			// Загружаем корневой макет из fxml файла.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			
			// Отображаем сцену, содержащую корневой макет.
			Scene scene = new Scene(rootLayout);
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Показывает в корневом макете сведения об адресатах.
	 */
	public void showPersonOverview() {
		try {
			// Загружаем сведения об адресатах.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/PersonOverview.fxml"));
			personOverview = (AnchorPane) loader.load();
			
			// Помещаем сведения об адресатах в центр корневого макета.
			rootLayout.setCenter(personOverview);
			
			// Даём контроллеру доступ к главному приложению.
			PersonOverviewController controller = loader.getController();
			controller.setMain(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * - Открывает диалоговое окно для изменения деталей указанного адресата
	 * - Если пользователь кликнул OK, то изменения сохраняются в предоставленном
	 *  объекте адресата и возвращается значение true.
	 * @param person - объект адресата, который надо изменить
	 * @return true, если пользователь кликнул OK, в противном случае false.
	 */
	public boolean showPersonEdit(Person person) {
		try {
			// Загружаем fxml-файл и создаём новую сцену
			// для всплывающего диалогового окна
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/PersonEdit.fxml"));
			AnchorPane anchorPane = (AnchorPane) loader.load();

			// Создаём диалоговое окно Stage
			Stage editStage = new Stage();
			editStage.setTitle("Edit Person");
			editStage.initModality(Modality.WINDOW_MODAL);
			editStage.initOwner(primaryStage);
			Scene scene = new Scene(anchorPane);
			editStage.setScene(scene);

			// Передаём адресата в контроллер
			PersonEditController personEditController = loader.getController();
			personEditController.setEditStage(editStage);
			personEditController.setPerson(person);

			// Отображаем диалоговое окно и ждём, пока пользователь его не закроет
			editStage.showAndWait();

			return personEditController.isOkClicked();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * Возвращает главную сцену.
	 */
	public Stage getprimaryStage() {
		return primaryStage;
	}
	public static void main(String[] args) {
		launch(args);
	}
}
