package Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class CreateAnimalMenuController implements Initializable {

    @FXML
    private TextField animalIdTxt;

    @FXML
    private TextField breedTxt;

    @FXML
    private TextField lifespanTxt;

    @FXML
    private TextField behaviorTxt;

    @FXML
    private TextField priceTxt;

    @FXML
    private RadioButton vacYesRBTN;

    @FXML
    private RadioButton vacNoRBTN;

    @FXML
    void onActionSaveAnimal (ActionEvent event) {

    }

    @FXML
    void onActionDisplayMainMenu (ActionEvent event) {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
