package ppb.grupo13.juegoCapitalesColombia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ppb.grupo13.juegoCapitalesColombia.model.Departamento;
import ppb.grupo13.juegoCapitalesColombia.model.Historial;
import ppb.grupo13.juegoCapitalesColombia.model.Jugador;
import ppb.grupo13.juegoCapitalesColombia.model.Pregunta;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Capitales de Colombia");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {

        launch();

    }
}