package ppb.grupo13.juegoCapitalesColombia.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import ppb.grupo13.juegoCapitalesColombia.HelloApplication;
import ppb.grupo13.juegoCapitalesColombia.model.CapitalesDeColombia;

import java.io.IOException;
import java.util.Objects;
/**
 * Clase para cambiar entre escenas en el juego "Capitales de Colombia".
 */
public class SceneSwitch {
    /**
     * Metodo para cambiar entre escenas.
     * @param currentAnchorPane el AnchorPane actual.
     * @param fxml el archivo FXML de la siguiente escena.
     * @throws IOException si ocurre un error al cargar el archivo FXML.
     */
    public static void SceneSwitch(AnchorPane currentAnchorPane, String fxml) throws IOException{
        AnchorPane nextAnchorPane = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource(fxml)));
        currentAnchorPane.getChildren().removeAll();
        currentAnchorPane.getChildren().setAll(nextAnchorPane);

    }

    /**
     * Metodo para cambiar entre escenas
     * @param currentAnchorPane Pane actual de la visualizacion
     * @param fxml archivo fxml de la vista a la cual se quiere cambiar
     * @param juego objeto CapitalesDeColombia para el paso entre los controladores
     * @throws IOException si ocurre un error al cargar el archivo FXML.
     */
    public static void realizarSwitch(AnchorPane currentAnchorPane, String fxml, CapitalesDeColombia juego) throws IOException{

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml));
        Scene scene = new Scene(fxmlLoader.load());
        if(fxml.equals("SceTablero.fxml")) {
            SceTableroController sceTableroController = (SceTableroController) fxmlLoader.getController();
            sceTableroController.setJuego(juego);
            sceTableroController.nuevaPregunta();
        } else if (fxml.equals("SceHistorial.fxml")) {
            SceHistorialController sceHistorialController = (SceHistorialController) fxmlLoader.getController();
            sceHistorialController.setJuego(juego);
            sceHistorialController.pintarHistorial();
        }else if (fxml.equals("SceBienvenida.fxml")) {
            SceBienvenidaController sceBienvenidaController = (SceBienvenidaController) fxmlLoader.getController();
        }
        HelloApplication.getStage().setScene(scene);


    }
}
