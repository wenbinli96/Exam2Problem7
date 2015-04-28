package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
 
public class Controller {
    @FXML private Text actiontarget;
    
    @FXML protected void handleOKButtonAction(ActionEvent event) {
        actiontarget.setText("bugaboo");
    }
    @FXML protected void handleHelpButtonAction(ActionEvent event) {
        actiontarget.setText("Help was clicked");
    }
}