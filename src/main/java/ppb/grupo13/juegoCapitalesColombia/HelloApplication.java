package ppb.grupo13.juegoCapitalesColombia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ppb.grupo13.juegoCapitalesColombia.model.Historial;
import ppb.grupo13.juegoCapitalesColombia.model.Jugador;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Scene2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Capitales de Colombia 1");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

        Historial h = new Historial();
        h.getPuntajesOrdenados();

        Jugador j = new Jugador("Fer",30);
        h.agregarJugador(j);
    }

    public static void main(String[] args) {

        launch();

    }
}