module ch.csbe.modul404.demonewscene {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.csbe.modul404.demonewscene to javafx.fxml;
    exports ch.csbe.modul404.demonewscene;
}