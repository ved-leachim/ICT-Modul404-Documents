package ch.csbe.modul404.personregistration;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField txtUserName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button btnLogin;

    @FXML
    private Label lblState;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    public void login(ActionEvent event) throws IOException {
        if (txtUserName.getText().length() == 0) {
            lblState.setText("Bitte geben Sie Ihren Benutzernamen ein.");
            return;
        }
        else if (txtPassword.getText().length() == 0) {
            lblState.setText("Bitte geben Sie Ihr Passwort ein.");
            return;
        }
        switchToPersonRegistrationScene(event);
    }

    private void switchToPersonRegistrationScene(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PersonRegistration.class.getResource("personRegistration.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
}