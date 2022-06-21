module ch.csbe.modul404.lb01praktisch {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.csbe.modul404.lb01praktisch to javafx.fxml;
    exports ch.csbe.modul404.lb01praktisch;
}