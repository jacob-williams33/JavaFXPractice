package Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class AnimalDetailsMenuController implements Initializable {

    @FXML
    private Label animalIDLBL;

    @FXML
    private Label breedLBL;

    @FXML
    private Label lifespanLBL;

    @FXML
    private Label behaviorLBL;

    @FXML
    private Label priceLBL;

    @FXML
    private Label vacLBL;

    @FXML
    private Label specialLBL;

    @FXML
    void onActionDisplayMainMenu (ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
