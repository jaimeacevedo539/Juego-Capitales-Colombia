package ppb.grupo13.juegoCapitalesColombia.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import ppb.grupo13.juegoCapitalesColombia.HelloApplication;
import ppb.grupo13.juegoCapitalesColombia.juego;
import ppb.grupo13.juegoCapitalesColombia.model.CapitalesDeColombia;
import ppb.grupo13.juegoCapitalesColombia.model.Pregunta;
import ppb.grupo13.juegoCapitalesColombia.model.Tablero;
import ppb.grupo13.juegoCapitalesColombia.pregunta;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;


public class SceTableroController {
    @FXML
    public Label mostrarRespuesta;
    @FXML
    public Button btnSiguiente;
    public Button btnResponder;
    public Label lblPuntajeActual;
    @FXML
    private Label labelInit;
    @FXML
    private ImageView mapa;
    @FXML
    private RadioButton respuesta1;
    @FXML
    private RadioButton respuesta2;
    @FXML
    private RadioButton respuesta3;
    @FXML
    private RadioButton respuesta4;

    private CapitalesDeColombia juego;
    private String randomMap;
    private Pregunta pregunta;

    @FXML
    protected void nuevaPregunta(){
        pregunta = juego.getTablero().generarPregunta();
        labelInit.setText(pregunta.getPregunta());
        randomMap = HelloApplication.class.getResource("images/"+juego.getTablero().getRutaImg()).toString();
        Image mapaMostrar = new Image(randomMap);
        mapa.setImage(mapaMostrar);
        ArrayList <String> respuestas = pregunta.getOpciones();

        respuesta1.setText(respuestas.get(0));
        respuesta2.setText(respuestas.get(1));
        respuesta3.setText(respuestas.get(2));
        respuesta4.setText(respuestas.get(3));
        mostrarRespuesta.setText("");


        respuesta1.setDisable(false);
        respuesta2.setDisable(false);
        respuesta3.setDisable(false);
        respuesta4.setDisable(false);
        btnResponder.setDisable(false);
        btnSiguiente.setDisable(true);
    }

    @FXML
    protected void responder(ActionEvent event){
        String respuestaUsuario;
        if(respuesta1.isSelected()){
            respuestaUsuario = respuesta1.getText();
        }else if(respuesta2.isSelected()){
            respuestaUsuario = respuesta2.getText();
        }else if(respuesta3.isSelected()){
            respuestaUsuario = respuesta3.getText();
        }else if(respuesta4.isSelected()){
            respuestaUsuario = respuesta4.getText();
        }else {
            respuestaUsuario = "";
        }
        //System.out.println("Respuesta Usuario - "+respuestaUsuario);
        //System.out.println("Respuesta Correcta - "+respuestaCorrecta);
        mostrarRespuesta.setText(juego.enviarRespuesta(respuestaUsuario));
        lblPuntajeActual.setText(juego.getJugador().getAlias()+": "+juego.obtenerPuntaje()+" puntos");

        btnResponder.setDisable(true);
        respuesta1.setDisable(true);
        respuesta2.setDisable(true);
        respuesta3.setDisable(true);
        respuesta4.setDisable(true);
        btnSiguiente.setDisable(false);
    }

    public void setJuego(CapitalesDeColombia juego){
        this.juego = juego;
    }

}
