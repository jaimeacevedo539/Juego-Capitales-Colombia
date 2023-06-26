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

    private static Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SceBienvenida.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Capitales de Colombia");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        setStage(stage);
    }

    public static Stage getStage(){
        return stage;
    }

    private static void setStage(Stage s){
        stage = s;
    }

    public static void main(String[] args) {

        launch();

    }
}