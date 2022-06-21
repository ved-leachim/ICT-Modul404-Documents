package ch.csbe.modul404.lb01praktisch;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PetRegistrationController {

    @FXML
    private TextArea txaMessage;

    @FXML
    private TextField txtSpecies;

    @FXML
    private TextField txtGender;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtSize;

    @FXML
    private TextField txtWeight;

    public void register(ActionEvent event) {

        if (txtSpecies.getText().length() == 0 || txtGender.getText().length() == 0) {
            txaMessage.setText("Bitte füllen Sie alle Stammdatenfelder aus.");
            return;
        }

        var newPet = new Pet(txtSpecies.getText(), txtGender.getText());

        if (txtName.getText().length() != 0)
            newPet.setName(txtName.getText());
        if (txtSize.getText().length() != 0)
            newPet.setSize(Integer.parseInt(txtSize.getText()));
        if (txtWeight.getText().length() != 0)
            newPet.setWeight(Integer.parseInt(txtWeight.getText()));

        txaMessage.setText(
                "Art: " + newPet.getSpecies() +
                " \n" +
                "Geschlecht: " + newPet.getGender() +
                " \n" +
                "Name: " + newPet.getName() +
                " \n" +
                "Grösse: " + newPet.getSize() + " cm" +
                " \n" +
                "Gewicht: " + newPet.getWeight() + " kg");
    }

    public void close (ActionEvent event) {
        System.exit(0);
    }

}