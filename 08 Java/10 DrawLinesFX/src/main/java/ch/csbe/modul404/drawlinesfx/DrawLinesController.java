package ch.csbe.modul404.drawlinesfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;

import java.util.ArrayList;

public class DrawLinesController {

    @FXML
    private AnchorPane rootNode;
    private double pressedX;
    private double pressedY;
    private double releasedX;
    private double releasedY;

    public void getPressedPosition(MouseEvent event) {
        pressedX = event.getX();
        pressedY = event.getY();
    }

    public void getReleasedPosition(MouseEvent event) {
        releasedX = event.getX();
        releasedY = event.getY();
        drawLine();
    }

    private void drawLine() {
        Line newLine = new Line(pressedX, pressedY, releasedX, releasedY);
        rootNode.getChildren().add(newLine);
    }

}