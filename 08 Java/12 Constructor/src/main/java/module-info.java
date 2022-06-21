module ch.csbe.modul404.constructor {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.csbe.modul404.constructor to javafx.fxml;
    exports ch.csbe.modul404.constructor;
}