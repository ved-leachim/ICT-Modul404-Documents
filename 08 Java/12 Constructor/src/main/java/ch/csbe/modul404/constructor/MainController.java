package ch.csbe.modul404.constructor;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label lblName;

    @FXML
    private Label lblType;

    @FXML
    public void createPokemon() {
        Pokemon newPokemon = new Pokemon("Ali", "Alkan");
        lblName.setText(newPokemon.getName());
        lblType.setText(newPokemon.getType());
    }
}