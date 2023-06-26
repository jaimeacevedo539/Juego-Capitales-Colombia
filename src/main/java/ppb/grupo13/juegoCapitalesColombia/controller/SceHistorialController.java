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

public class SceHistorialController {

    public TableView tblPuntajes;
    public TableColumn tcAlias;
    public TableColumn tcPuntaje;
    @FXML
    private AnchorPane AnchorPaneScene1;

    private CapitalesDeColombia juego;

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

    public void setJuego(CapitalesDeColombia juego){
        this.juego = juego;
    }

    public void onReiniciarButtonClick(ActionEvent actionEvent) throws IOException {
        SceneSwitch.realizarSwitch(AnchorPaneScene1,"SceBienvenida.fxml",new CapitalesDeColombia());
    }
}