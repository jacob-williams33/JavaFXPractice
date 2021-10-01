package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static javafx.fxml.FXMLLoader.*;

public class MainMenuController implements Initializable {

    Stage stage;
    Parent scene;

    @FXML
    void onActionCreateAnimal (javafx.event.ActionEvent event) throws IOException {
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/CreateAnimalMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();

    }

    @FXML
    void onActionDisplayAnimals (javafx.event.ActionEvent event) throws IOException {
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/view/DisplayAnimalsMenu.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

    @FXML
    void onActionExit (javafx.event.ActionEvent event) {
        System.out.println("Exited");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
