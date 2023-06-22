module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens ppb.grupo13.juegoCapitalesColombia to javafx.fxml;
    exports ppb.grupo13.juegoCapitalesColombia;
}