package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

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

        pregunta pregunta1 = new pregunta();
        labelDepartamento.setText(pregunta1.getDepartamento());
        labelCapital.setText(pregunta1.getCapital());
        labelDescripcion.getChildren().clear();
        Text Desc = new Text(pregunta1.getDescripcion());

        labelDescripcion.getChildren().add(Desc);

        //campoTexto.setText("");
        //numero = (int)(Math.random()*30+1);

        //Departamento = matriz[numero][0];
        Departamento = pregunta1.getDepartamento();
        Capital = pregunta1.getCapital();
        //Descripcion = matriz2[numero][2];
        //aleatorio.setText(Capital);
        RandomMap = pregunta1.getCodigo()+".png";
        Image mapaMostrar = new Image(getClass().getResourceAsStream(RandomMap));
        mapa.setImage(mapaMostrar);
        //labelDescripcion.setText(pregunta1.getDescripcion());

        //departamento.setText(Departamento);
        System.out.println(pregunta1.getCodigo() +" - " + pregunta1.getDepartamento() +" - " + pregunta1.getCapital());
        System.out.println(pregunta1.generarOpciones());
        System.out.println(Desc);


    }

}