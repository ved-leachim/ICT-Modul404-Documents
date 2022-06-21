package ch.csbe.modul404.clickcounterfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ClickCounter extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ClickCounter.class.getResource("clickCounter.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("ClickCounter!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}