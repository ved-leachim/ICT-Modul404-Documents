module ch.csbe.modul404.drawlinesfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.csbe.modul404.drawlinesfx to javafx.fxml;
    exports ch.csbe.modul404.drawlinesfx;
}