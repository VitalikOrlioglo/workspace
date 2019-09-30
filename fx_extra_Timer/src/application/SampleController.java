package application;



import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class SampleController {


    @FXML
    private Label label;
    
    private int counter;
    
    private Timeline timeline;

    @FXML
    void startAction(ActionEvent event) {
    	timeline.play(); 
    }

    @FXML
    void stopAction(ActionEvent event) {
    	timeline.stop();
    }

    @FXML
    void initialize() {
     timeline =	new Timeline(new KeyFrame(
      		     new Duration(1000), 
      		     ae -> count())) ;
     timeline.setCycleCount(Timeline.INDEFINITE);
    	
    }
    
    private void count() {
    	counter++;
    	label.setText(counter+"");
    }
}
