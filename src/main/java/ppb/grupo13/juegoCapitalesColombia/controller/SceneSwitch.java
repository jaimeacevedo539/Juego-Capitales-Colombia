package ppb.grupo13.juegoCapitalesColombia.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import ppb.grupo13.juegoCapitalesColombia.HelloApplication;
import ppb.grupo13.juegoCapitalesColombia.model.CapitalesDeColombia;

import java.io.IOException;
import java.util.Objects;

public class SceneSwitch {
    public static void SceneSwitch(AnchorPane currentAnchorPane, String fxml) throws IOException{
        AnchorPane nextAnchorPane = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource(fxml)));
        currentAnchorPane.getChildren().removeAll();
        currentAnchorPane.getChildren().setAll(nextAnchorPane);

    }

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
        }
        HelloApplication.getStage().setScene(scene);


    }
}
