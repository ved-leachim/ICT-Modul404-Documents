module ch.csbe.modul404.colorchanger {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.csbe.modul404.colorchanger to javafx.fxml;
    exports ch.csbe.modul404.colorchanger;
}