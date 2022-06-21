module ch.csbe.modul404.lb01schriftlich {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.csbe.modul404.lb01schriftlich to javafx.fxml;
    exports ch.csbe.modul404.lb01schriftlich;
}