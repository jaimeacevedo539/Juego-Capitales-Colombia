package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.ArrayList;
import java.util.Arrays;

public class HelloController {
    @FXML
    private Label aleatorio;

    @FXML
    private Label otroLabel;

    @FXML
    private TextField campoTexto;
    @FXML
    private ImageView mapa;

    int numero;
    String RandomMap;
    String Departamento;
    String Capital;
    String Descripcion;

    String[] matriz = new String[] {
            "prueba0",
            "Amazonas",
            "Antioquia",
            "Arauca",
            "Atlantico",
            "Bolivar",
            "Boyaca",
            "Caldas",
            "Caqueta",
            "Casanare",
            "Cauca",
            "Cesar",
            "Chocó",
            "Cordoba",
            "Cundinamarca",
            "Guainia",
            "Guaviare",
            "Huila",
            "La Guajira",
            "Magdalena",
            "Meta",
            "Nariño",
            "Norte de Santander",
            "Putumayo",
            "Quindio",
            "Risaralda",
            "San Andres y Providencia",
            "Santander",
            "Sucre",
            "Tolima",
            "Valle del Cauca",
            "Vaupés",
            "Vichada"
    };

    String[][] matriz2 = new String[][]{
            {"Colombia", "Bogota", ""},

            {"Amazonas", "Leticia", "El departamento del Amazonas está ubicado en el extremo sur del país, en la región Amazonía. Es el departamento con mayor superficie de Colombia, aunque en su mayoría es territorio selvático."},
            {"Antioquia", "Medellín"},
            {"Arauca", "Arauca"},
            {"Atlántico", "Barranquilla"},
            {"Bolívar ", " Cartagena"},
            {"Boyacá", "Tunja"},
            {"Caldas", "Manizales"},
            {"Caquetá", "Florencia"},
            {"Casanare", "Yopal"},
            {"Cauca", "Popayán"},
            {"Cesar", "Valledupar"},
            {"Chocó", "Quibdó"},
            {"Córdoba", "Montería"},
            {"Cundinamarca", "Bogotá"},
            {"Guainía", "Puerto Inírida"},
            {"Guaviare", "San José del Guaviare"},
            {"Huila", "Neiva"},
            {"La Guajira", "Riohacha"},
            {"Magdalena", "Santa Marta"},
            {"Meta", "Villavicencio"},
            {"Nariño", "Pasto"},
            {"Norte de Santander", "Cúcuta"},
            {"Putumayo", "Mocoa"},
            {"Quindío", "Armenia"},
            {"Risaralda", "Pereira"},
            {"San Andrés y Providencia", "San Andrés"},
            {"Santander", "Bucaramanga"},
            {"Sucre", "Sincelejo"},
            {"Tolima", "Ibagué"},
            {"Valle del Cauca", "Cali"},
            {"Vaupés", "Mitú"},
            {"Vichada", "Puerto Carreño"}



    }

            ;

    @FXML
    protected void onHelloButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
        otroLabel.setText("Hola " + campoTexto.getText());

        campoTexto.setText("");
        numero = (int)(Math.random()*30+1);

        Departamento = matriz2[numero][0];
        Capital = matriz2[numero][1];
        //Descripcion = matriz2[numero][2];
        aleatorio.setText(Capital);
        RandomMap = numero+".png";
        Image mapaMostrar = new Image(getClass().getResourceAsStream(RandomMap));
        mapa.setImage(mapaMostrar);
        otroLabel.setText(Departamento);
        //System.out.println(Departamento+ " - "+ Capital+" - "+Descripcion);


    }

}