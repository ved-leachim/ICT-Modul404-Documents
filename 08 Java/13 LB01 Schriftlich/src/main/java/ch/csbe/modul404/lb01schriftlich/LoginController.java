package ch.csbe.modul404.lb01schriftlich;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Label lblMessage;

    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassword;

    private boolean isLoggedIn = "false";

    public void login(ActionEvent event) {
        if (txtPassword == ("pw12345")) {
            lblMessage.setVisible(false);
        }
        if (txtPassword.getText().equals("M404")) {
            lblMessage.setVisible(true);
        }
        // HANLDE-LOGIN
        this.isLoggedIn = "false";
        lblMessage.setVisible(true);
    }
}