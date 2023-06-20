package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.RadioButton;



public class Scene3Controller {
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

    juego game = new juego();
    pregunta preguntaini = game.generarPregunta();
    String RandomMap;

    @FXML
    protected void initialize(){
        labelInit.setText("cargado iniciar");
        labelInit.setText(preguntaini.getDepartamento());
        RandomMap = preguntaini.getCodigo() + ".png";
        Image mapaMostrar = new Image(getClass().getResourceAsStream(RandomMap));
        mapa.setImage(mapaMostrar);
        for (int i = 0; i < 4; i++) {
            System.out.println(preguntaini.generarOpciones()[i][0]);

        }
        respuesta1.setText(preguntaini.getCapital());
        System.out.println("-----");
        respuesta1.setText(preguntaini.generarOpciones()[0][0]);
        respuesta2.setText(preguntaini.generarOpciones()[1][0]);
        respuesta3.setText(preguntaini.generarOpciones()[2][0]);
        respuesta4.setText(preguntaini.generarOpciones()[3][0]);
    }
    @FXML
    protected void nuevaPregunta(){
        pregunta question = game.generarPregunta();
        labelInit.setText(question.getDepartamento());
        RandomMap = question.getCodigo() + ".png";
        Image mapaMostrar = new Image(getClass().getResourceAsStream(RandomMap));
        mapa.setImage(mapaMostrar);
        //System.out.println(question.generarOpciones());
        for (int i = 0; i < 4; i++) {
            System.out.println(question.generarOpciones()[i][0]);
        }
        System.out.println("-----");
        respuesta1.setText(question.generarOpciones()[0][0]);
        respuesta2.setText(question.generarOpciones()[1][0]);
        respuesta3.setText(question.generarOpciones()[2][0]);
        respuesta4.setText(question.generarOpciones()[3][0]);
    }

}
