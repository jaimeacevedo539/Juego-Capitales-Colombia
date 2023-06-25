package ppb.grupo13.juegoCapitalesColombia;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

/**
 * Clase para cambiar entre escenas en el juego "Capitales de Colombia".
 */
public class SceneSwitch {
    /**
     * Constructor para cambiar entre escenas.
     * @param currentAnchorPane el AnchorPane actual.
     * @param fxml el archivo FXML de la siguiente escena.
     * @throws IOException si ocurre un error al cargar el archivo FXML.
     */
    public SceneSwitch(AnchorPane currentAnchorPane, String fxml) throws IOException{
        AnchorPane nextAnchorPane = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource(fxml)));
        currentAnchorPane.getChildren().removeAll();
        currentAnchorPane.getChildren().setAll(nextAnchorPane);

    }
}
