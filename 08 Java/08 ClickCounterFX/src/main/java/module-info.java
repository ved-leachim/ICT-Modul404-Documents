module ch.csbe.modul404.clickcounterfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.csbe.modul404.clickcounterfx to javafx.fxml;
    exports ch.csbe.modul404.clickcounterfx;
}