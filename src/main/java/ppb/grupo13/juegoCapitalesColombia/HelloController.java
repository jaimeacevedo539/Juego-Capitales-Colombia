package ppb.grupo13.juegoCapitalesColombia;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

/**
 * Controlador para la vista principal del juego "Capitales de Colombia".
 */
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

    /**
     * Método para manejar el evento del botón "Hello".
     */
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
        Image mapaMostrar = new Image(getClass().getResourceAsStream("images/"+RandomMap));
        mapa.setImage(mapaMostrar);
        //labelDescripcion.setText(pregunta1.getDescripcion());

        //departamento.setText(Departamento);
        System.out.println(pregunta1.getCodigo() + " - " + pregunta1.getDepartamento() + " - " + pregunta1.getCapital());
        System.out.println(pregunta1.generarOpciones());
        System.out.println(Desc);


    }




}
