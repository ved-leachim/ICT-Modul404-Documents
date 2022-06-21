package ch.csbe.modul404.demonewscene;

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

public class SceneOneController {
    @FXML
    private Label lblMessage;

    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtUserName;

    @FXML
    private PasswordField txtPassword;

    public void login(ActionEvent event) {
        // Check if Username is empty
        if (txtUserName.getText().length() == 0) {
            lblMessage.setText("Please enter a valid username.");
            return;
        }
        // Check if Password is empty
        if (txtPassword.getText().length() == 0) {
            lblMessage.setText("Please enter a valid password.");
            return;
        }
        // If both have text, then allow login
        switchToSceneTwo(event);
    }

    private void switchToSceneTwo(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(DemoNewScene.class.getResource("sceneTwo.fxml"));
        Stage stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
        try {
            Scene sceneTwo = new Scene(fxmlLoader.load());
            stage.setScene(sceneTwo);
            stage.show();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}