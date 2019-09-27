package application;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SampleController {


    @FXML
    private Rectangle rect;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    void initialize() {
//    	colorPicker = new ColorPicker();
//    	rect.setFill(colorPicker);
    	rect.fillProperty().bind(colorPicker.valueProperty());
    }
}
