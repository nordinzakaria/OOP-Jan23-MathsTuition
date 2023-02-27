module com.example.mathtuitioncenter {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.mathtuitioncenter to javafx.fxml;
    exports com.example.mathtuitioncenter;
}