package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;

public class Kuhlschrank {

    public Kuhlschrank() {

    }

    @FXML
    private Button Zuruck;





    public void zuruckgehen(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("afterLogin.fxml");

    }



}