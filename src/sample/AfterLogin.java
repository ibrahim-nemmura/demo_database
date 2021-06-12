package sample;

import com.sun.javafx.fxml.builder.JavaFXSceneBuilder;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import java.io.IOException;


public class AfterLogin extends JavaFXSceneBuilder {

    public AfterLogin() {


    }

    @FXML
    private Button logout;
    @FXML
    private Button Test;


    public void userLogOut(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("sample.fxml");
    }

    public void test_kuhlschrank(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("Kuhlschrank_Testen.fxml");
    }

}