module com.mycompany.maber {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.mycompany.maber to javafx.fxml;
    exports com.mycompany.maber;
}
