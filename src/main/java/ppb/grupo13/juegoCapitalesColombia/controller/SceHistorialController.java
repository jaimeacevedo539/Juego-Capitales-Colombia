package ppb.grupo13.juegoCapitalesColombia.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import ppb.grupo13.juegoCapitalesColombia.SceneSwitch;
import ppb.grupo13.juegoCapitalesColombia.model.CapitalesDeColombia;

import java.io.IOException;

public class SceHistorialController {

    @FXML
    private AnchorPane Scene2AnchorPane;

    @FXML
    private Button newGame;

    private CapitalesDeColombia juego;

    @FXML
    void inicio(ActionEvent event) throws IOException {
        new SceneSwitch(Scene2AnchorPane, "Scene3.fxml");
    }

    public void setJuego(CapitalesDeColombia juego){
        this.juego = juego;
    }

}