package ppb.grupo13.juegoCapitalesColombia.controller;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import ppb.grupo13.juegoCapitalesColombia.SceneSwitch;
import ppb.grupo13.juegoCapitalesColombia.model.CapitalesDeColombia;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SceHistorialController {

    public TableView tblPuntajes;
    @FXML
    private AnchorPane AnchorPaneScene1;

    private CapitalesDeColombia juego;

    public void pintarHistorial(){
        /*TreeMap <Integer,String> historia =  juego.getHistorial().getPuntajesOrdenados();
        Observable<TreeMap<Integer,String>> obs = FXCollections.observableArrayList(historia);
        tblPuntajes.setItems(obs);*/
    }

    public void setJuego(CapitalesDeColombia juego){
        this.juego = juego;
    }

}