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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LogIn {

    public LogIn() {

    }

    @FXML
    private Button button;

    @FXML
    private Label wrongLogIn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;



    public void userLogIn(ActionEvent event) throws IOException {
        validateLogin();

    }

    public void validateLogin(){
        Main m = new Main();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_tau", "root", "");

            Statement statement = connection.createStatement();

            //ResultSet resultSet = statement.executeQuery("select * from users WHERE username ='" + username.getText()+"'" );

            ResultSet resultSet = statement.executeQuery("SELECT count(1) FROM users WHERE username = '" + username.getText() + "' and password = '" + password.getText() + "'");
            while (resultSet.next()) {
                if (resultSet.getInt(1)==1){
                    //System.out.println("of");
                    wrongLogIn.setText("Success!");
                    m.changeScene("afterLogin.fxml");
                } else if(username.getText().isEmpty() && password.getText().isEmpty()) {
                    wrongLogIn.setText("Please enter your data.");
                } else if(password.getText().isEmpty()){
                    wrongLogIn.setText("Please enter your password.");
                } else if(username.getText().isEmpty()){
                    wrongLogIn.setText("Please enter your username.");
                } else {
                    wrongLogIn.setText("Wrong username or password!");
                }
                //System.out.println(resultSet.getInt("1"));
                //System.out.println(resultSet.getString("firstname"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }


    }

    /*private void checkLogin() throws IOException {
        Main m = new Main();
        if(username.getText().toString().equals("ahmet") && password.getText().toString().equals("123")) {
            wrongLogIn.setText("Success!");

            m.changeScene("afterLogin.fxml");
        }

        else if(username.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogIn.setText("Please enter your data.");
        }


        else {
            wrongLogIn.setText("Wrong username or password!");
        }
    }*/


}