package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Label labelDepartamento;
    @FXML
    private Label labelCapital;
    @FXML
    private TextFlow labelDescripcion;
    @FXML
    private ImageView mapa;

    String RandomMap;
    String Departamento;
    String Capital;
    @FXML
    protected void onHelloButtonClick() {
        juego game = new juego();
        pregunta pregunta1 = game.generarPregunta();

//        pregunta pregunta1 = new pregunta();
        labelDepartamento.setText(pregunta1.getDepartamento());
        labelCapital.setText(pregunta1.getCapital());
        labelDescripcion.getChildren().clear();
        Text Desc = new Text(pregunta1.getDescripcion());

        labelDescripcion.getChildren().add(Desc);

        Departamento = pregunta1.getDepartamento();
        Capital = pregunta1.getCapital();
        //Descripcion = matriz2[numero][2];
        //aleatorio.setText(Capital);
        RandomMap = pregunta1.getCodigo() + ".png";
        Image mapaMostrar = new Image(getClass().getResourceAsStream(RandomMap));
        mapa.setImage(mapaMostrar);
        //labelDescripcion.setText(pregunta1.getDescripcion());

        //departamento.setText(Departamento);
        System.out.println(pregunta1.getCodigo() + " - " + pregunta1.getDepartamento() + " - " + pregunta1.getCapital());
        System.out.println(pregunta1.generarOpciones());
        System.out.println(Desc);


    }




}