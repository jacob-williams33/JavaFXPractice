package Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class DisplayAnimalMenuController implements Initializable {

    @FXML
    private TableView animalTableView;

    @FXML
    private TableColumn animalIDCOL;

    @FXML
    private TableColumn breedCOL;

    @FXML
    private TableColumn lifespanCOL;

    @FXML
    private TableColumn priceCOL;

    @FXML
    void onActionDisplayAnimalDetailsMenu (ActionEvent event) {

    }

    @FXML
    void onActionDisplayMainMenu (ActionEvent event) {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
