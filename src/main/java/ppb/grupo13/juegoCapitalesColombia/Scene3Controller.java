package ppb.grupo13.juegoCapitalesColombia;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.RadioButton;

import java.util.Arrays;


public class Scene3Controller {
    @FXML
    public Label mostrarRespuesta;
    @FXML
    public Button btnSiguiente;
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
    String respuestaUsuario;
    String respuestaCorrecta;

    @FXML
    protected void initialize(){
        labelInit.setText("cargado iniciar");
        labelInit.setText(preguntaini.getDepartamento());
        RandomMap = preguntaini.getCodigo() + ".png";
        Image mapaMostrar = new Image(getClass().getResourceAsStream("images/"+RandomMap));
        mapa.setImage(mapaMostrar);
        String Respuestas[] = preguntaini.generarOpciones();
        Arrays.sort(Respuestas);
        respuestaCorrecta = preguntaini.getCapital();
        for (int i = 0; i < 4; i++) {
            System.out.println(preguntaini.generarOpciones()[i]);

        }
        //respuesta1.setText(preguntaini.getCapital());
        System.out.println("-----");
        respuesta1.setText(Respuestas[0]);
        respuesta2.setText(Respuestas[1]);
        respuesta3.setText(Respuestas[2]);
        respuesta4.setText(Respuestas[3]);
    }
    @FXML
    protected void nuevaPregunta(){
        pregunta question = game.generarPregunta();
        labelInit.setText(question.getDepartamento());
        RandomMap = question.getCodigo() + ".png";
       Image mapaMostrar = new Image(getClass().getResourceAsStream(RandomMap));
       mapa.setImage(mapaMostrar);
        respuestaCorrecta = question.getCapital();
        String Respuestas[] = question.generarOpciones();
        Arrays.sort(Respuestas);
        //System.out.println(question.generarOpciones());
        for (int i = 0; i < 4; i++) {
            System.out.println(Respuestas[i]);
        }
        System.out.println("-----");
        respuesta1.setText(Respuestas[0]);
        respuesta2.setText(Respuestas[1]);
        respuesta3.setText(Respuestas[2]);
        respuesta4.setText(Respuestas[3]);
    }

    @FXML
    protected void responder(ActionEvent event){
        if(respuesta1.isSelected()){
            System.out.println("Respuesta Usuario - "+respuesta1.getText());
            System.out.println("Respuesta Correcta - "+respuestaCorrecta);
            respuestaUsuario = respuesta1.getText();
        }
        if(respuesta2.isSelected()){
            System.out.println("Respuesta - "+respuesta2.getText());
            respuestaUsuario = respuesta2.getText();
            System.out.println("Respuesta Correcta - "+respuestaCorrecta);
        }
        if(respuesta3.isSelected()){
            System.out.println("Respuesta - "+respuesta3.getText());
            respuestaUsuario = respuesta3.getText();
            System.out.println("Respuesta Correcta - "+respuestaCorrecta);
        }
        if(respuesta4.isSelected()){
            System.out.println("Respuesta - "+respuesta4.getText());
            respuestaUsuario = respuesta4.getText();
            System.out.println("Respuesta Correcta - "+respuestaCorrecta);
        }
            mostrarRespuesta.setText("LA RESPUESTA ES: "+ respuestaCorrecta);
    }

    @FXML
    protected void nuevaPreguntaDos(){
        pregunta nextPregunta = game.generarPregunta();
        labelInit.setText(nextPregunta.getDepartamento());


        respuestaCorrecta = nextPregunta.getCapital();
        String Respuestas[] = nextPregunta.generarOpciones();


        for (int i = 0; i < 4; i++) {
            System.out.println(Respuestas[i]);
        }
        System.out.println("-----");
        respuesta1.setText(Respuestas[0]);
        respuesta2.setText(Respuestas[1]);
        respuesta3.setText(Respuestas[2]);
        respuesta4.setText(Respuestas[3]);
    }
}
