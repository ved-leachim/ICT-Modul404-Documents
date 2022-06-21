package ch.csbe.modul404.demonewscene;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DemoNewScene extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DemoNewScene.class.getResource("sceneOne.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("DemoNewScene");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}