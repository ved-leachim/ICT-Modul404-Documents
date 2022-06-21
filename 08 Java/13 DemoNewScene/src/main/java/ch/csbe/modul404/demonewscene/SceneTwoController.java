package ch.csbe.modul404.demonewscene;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SceneTwoController {
    @FXML
    private Button btnLogout;

    public void switchToSceneOne(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(DemoNewScene.class.getResource("sceneOne.fxml"));
        Stage stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
        try {
            Scene sceneOne = new Scene(fxmlLoader.load());
            stage.setScene(sceneOne);
            stage.show();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
