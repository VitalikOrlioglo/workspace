package application;

import java.io.File;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.stage.DirectoryChooser;

public class SampleController {

	@FXML
	public void open() {
		DirectoryChooser dc = new DirectoryChooser();
		File file = dc.showDialog(null);
		System.out.println(file.getAbsolutePath());
	}

	@FXML
	public void exit() {
		Platform.exit();
	}
	
}
