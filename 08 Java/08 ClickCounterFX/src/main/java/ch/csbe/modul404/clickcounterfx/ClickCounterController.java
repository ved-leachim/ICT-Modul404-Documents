package ch.csbe.modul404.clickcounterfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class ClickCounterController {
    private int clicked = 0;
    @FXML
    private Label lblClicked;

    @FXML
    public void onClick(MouseEvent event) {
        clicked++;
        lblClicked.setText("Totally clicked: " + clicked);
    }
}