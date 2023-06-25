package ppb.grupo13.juegoCapitalesColombia;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

/**
 * Controlador para la segunda escena del juego "Capitales de Colombia".
 */
public class Scene2Controller {

    @FXML
    private AnchorPane Scene2AnchorPane;

    @FXML
    private Button newGame;

    /**
     * Método para manejar el evento del botón "Inicio".
     * @param event el evento del botón.
     * @throws IOException si ocurre un error al cambiar de escena.
     */
    @FXML
    void inicio(ActionEvent event) throws IOException {
        new SceneSwitch(Scene2AnchorPane, "Scene3.fxml");
    }

}
