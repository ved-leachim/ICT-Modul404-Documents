package ch.csbe.modul404.colorchanger;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class ColorChangerController {

    private double mouseX;

    @FXML
    private AnchorPane rootNode;

    @FXML
    public void trackMousePosition(MouseEvent event){
        mouseX = event.getX();
        changeColor(mouseX);
    }

    private void changeColor(double mouseX) {
        double anchorPaneMiddleX = rootNode.getWidth()/2.0;

        if (mouseX <= anchorPaneMiddleX)
            rootNode.setStyle("-fx-background-color: RED");
        else
            rootNode.setStyle("-fx-background-color: BLUE");
    }

}