package ppb.grupo13.juegoCapitalesColombia.controller;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import ppb.grupo13.juegoCapitalesColombia.model.CapitalesDeColombia;
import ppb.grupo13.juegoCapitalesColombia.model.Jugador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Clase controlador de la vista del historial de puntajes
 */
public class SceHistorialController {

    public TableView tblPuntajes;
    public TableColumn tcAlias;
    public TableColumn tcPuntaje;
    @FXML
    private AnchorPane AnchorPaneScene1;

    private CapitalesDeColombia juego;

    /**
     * Metodo para llenar la tabla del historial de puntajes.
     */
    public void pintarHistorial(){
        ArrayList<Jugador> jugadores = juego.getHistorial().getJugadores();

        tcAlias.setCellValueFactory(new PropertyValueFactory<>("alias"));

        tcPuntaje.setCellValueFactory(new PropertyValueFactory<>("puntaje"));

        for (Jugador j:jugadores) {
            tblPuntajes.getItems().add(j);
        }

        tblPuntajes.getSortOrder().removeAll();
        tblPuntajes.getSortOrder().add(tcPuntaje);
        tblPuntajes.sort();

    }
    /**
     * Metodo para el paso del objeto CapitalesDeColombia a traves de los controladores.
     * @param juego
     */
    public void setJuego(CapitalesDeColombia juego){
        this.juego = juego;
    }

    /**
     * Metodo para manejar el evento del boton "Reiniciar" en la pantalla de Historia de puntajes
     * @param actionEvent
     * @throws IOException si ocurre un error al cambiar de escena.
     */
    public void onReiniciarButtonClick(ActionEvent actionEvent) throws IOException {
        SceneSwitch.realizarSwitch(AnchorPaneScene1,"SceBienvenida.fxml",new CapitalesDeColombia());
    }
}