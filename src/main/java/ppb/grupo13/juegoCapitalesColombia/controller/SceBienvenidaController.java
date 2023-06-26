package ppb.grupo13.juegoCapitalesColombia.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import ppb.grupo13.juegoCapitalesColombia.model.*;
/**
 * Controlador para la primera escena del juego "Capitales de Colombia".
 */
public class SceBienvenidaController {


    public AnchorPane AnchorPaneScene1;
    private CapitalesDeColombia juego;

    public SceBienvenidaController(){
        juego = new CapitalesDeColombia();
    }

    public SceBienvenidaController(CapitalesDeColombia j){
        if(j == null){
            j = new CapitalesDeColombia();
        }
        juego = j;
    }

    @FXML
    private Label labelDepartamento;
    @FXML
    private Label labelCapital;
    @FXML
    private Button boton;
    @FXML
    private ImageView mapa;
    @FXML
    public TextField tfAlias;
    /**
     * Método para manejar el evento del botón "Inicio".
     * @param event el evento del botón.
     */
    @FXML
    protected void onHelloButtonClick() {
        try {
            String alias = tfAlias.getText();
            juego.registrarJugador(alias);
            SceneSwitch.realizarSwitch(AnchorPaneScene1, "SceTablero.fxml", juego);
        }catch (Exception e){
            System.out.println("Error switcheando Tablero:");
            System.out.println(e);
        }

    }
}
