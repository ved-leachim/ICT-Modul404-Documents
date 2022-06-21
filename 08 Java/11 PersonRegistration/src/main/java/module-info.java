module ch.csbe.modul404.personregistration {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.csbe.modul404.personregistration to javafx.fxml;
    exports ch.csbe.modul404.personregistration;
}