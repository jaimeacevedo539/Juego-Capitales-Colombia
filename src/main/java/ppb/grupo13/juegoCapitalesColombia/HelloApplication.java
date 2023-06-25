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

/**
 * Clase principal del juego "Capitales de Colombia".
 */
public class HelloApplication extends Application {
    /**
     * Método para iniciar el juego.
     * @param stage el escenario principal del juego.
     * @throws IOException si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        /* FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Scene2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Capitales de Colombia 1");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        */

        /*
        Historial h = new Historial();
        h.getPuntajesOrdenados();

        Jugador j = new Jugador("Fer",30);
        h.agregarJugador(j);
        */

        /*Pregunta p = new Pregunta("Cundinamarca");
        System.out.println(p.getPregunta());
        System.out.println(p.getRespuestaCorrecta());
        System.out.println(p.getPuntaje());
        System.out.println("opciones: ");

        for (Object g:p.getOpciones()) {
            System.out.println(g);
        }*/




    }

    /**
     * Método principal para ejecutar el juego.
     * @param args argumentos de línea de comando.
     */
    public static void main(String[] args) {

        launch();

    }
}
