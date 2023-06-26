module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.json;
    opens ppb.grupo13.juegoCapitalesColombia to javafx.fxml;
    exports ppb.grupo13.juegoCapitalesColombia;
    opens ppb.grupo13.juegoCapitalesColombia.controller to javafx.fxml;
    exports ppb.grupo13.juegoCapitalesColombia.controller;
    opens ppb.grupo13.juegoCapitalesColombia.model to javafx.base;
    exports ppb.grupo13.juegoCapitalesColombia.model;
}