package ch.csbe.modul404.colorchanger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ColorChanger extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ColorChanger.class.getResource("colorChanger.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("ColorChanger!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}