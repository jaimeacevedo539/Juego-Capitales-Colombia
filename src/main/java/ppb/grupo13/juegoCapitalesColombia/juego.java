package ppb.grupo13.juegoCapitalesColombia;

/**
 * Clase para representar el juego "Capitales de Colombia".
 */
public class juego {
    //constructor
    public juego(){}
    int cantidadPreguntas = 10;
    int puntaje = 0;

    /**
     * Método para generar una nueva pregunta.
     * @return una nueva pregunta.
     */
    public pregunta generarPregunta(){
        pregunta nuevaPregunta = new pregunta();
        return nuevaPregunta;
    }

    /**
     * Método para establecer el puntaje del juego.
     */
    public void setScore(){

    }

}
