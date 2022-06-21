package ch.csbe.modul404.lb01praktisch;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PetRegistration extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PetRegistration.class.getResource("petRegistration.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Pet Registration");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}