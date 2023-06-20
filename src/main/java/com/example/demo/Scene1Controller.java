package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.application.Preloader;

import java.io.IOException;
public class Scene1Controller {

    juego game = new juego();


    @FXML
    private Label labelDepartamento;

    @FXML
    private Label labelCapital;
    @FXML
    private TextFlow labelDescripcion;
    @FXML
    private Button boton;
    @FXML
    String Departamento;
    String Capital;
    String RandomMap;
    int contador = 0;






    @FXML
    private ImageView mapa;
    @FXML
    protected void onHelloButtonClick() {
            boton.setText("Siguiente");
            pregunta pregunta1 = game.generarPregunta();
            labelDepartamento.setText(pregunta1.getDepartamento());
            labelCapital.setText(pregunta1.getCapital());
            labelDescripcion.getChildren().clear();
            Text Desc = new Text(pregunta1.getDescripcion());
            labelDescripcion.getChildren().add(Desc);
            Departamento = pregunta1.getDepartamento();
            Capital = pregunta1.getCapital();
            RandomMap = pregunta1.getCodigo() + ".png";
            Image mapaMostrar = new Image(getClass().getResourceAsStream(RandomMap));
            mapa.setImage(mapaMostrar);
            //System.out.println(pregunta1.getCodigo() + " - " + pregunta1.getDepartamento() + " - " + pregunta1.getCapital());
            //System.out.println(pregunta1.generarOpciones());
            //System.out.println(Desc);
            System.out.println(contador);
            contador++;
            if(contador==5){
                boton.setText("finalizar");

            }
            if(contador ==6){
                System.exit(0);
            }

    }


}
