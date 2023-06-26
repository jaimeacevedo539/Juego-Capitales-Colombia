package ppb.grupo13.juegoCapitalesColombia.model;

/**
 * Clase para representar el juego "Capitales de Colombia".
 */
public class CapitalesDeColombia {

    private Historial historial;
    private Jugador jugador;
    private Tablero tablero;

    /**
     * Constructor por defecto para la clase CapitalesDeColombia.
     */
    public CapitalesDeColombia() {
        setHistorial(new Historial());
        setTablero(new Tablero());
    }

    /**
     * Constructor para la clase CapitalesDeColombia que recibe un historial y un tablero.
     * @param historial el historial del juego.
     * @param tablero el tablero del juego.
     */
    public CapitalesDeColombia(Historial historial, Tablero tablero) {
        setHistorial(historial);
        setTablero(tablero);
    }

    /**
     * Método para obtener el historial del juego.
     * @return el historial del juego.
     */
    public Historial getHistorial() {return historial;    }

    /**
     * Método para establecer el historial del juego.
     * @param historial el historial del juego.
     */
    private void setHistorial(Historial historial) {
        this.historial = historial;
    }

    /**
     * Método para obtener el jugador del juego.
     * @return el jugador del juego.
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * Método para establecer el jugador del juego.
     * @param jugador el jugador del juego.
     */
    private void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * Método para obtener el tablero del juego.
     * @return el tablero del juego.
     */
    public Tablero getTablero() {
        return tablero;
    }

    /**
     * Método para establecer el tablero del juego.
     * @param tablero el tablero del juego.
     */
    private void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    /**
     * Método para enviar una respuesta al juego y verificar si es correcta o incorrecta.
     * @param respuesta la respuesta enviada por el usuario.
     * @return un mensaje indicando si la respuesta es correcta o incorrecta y la descripción de la pregunta actual.
     */
    public String enviarRespuesta(String respuesta){
        if(tablero.responder(respuesta)){
            jugador.sumarPuntaje(tablero.obtenerPuntaje());
            //tablero.generarPregunta();
            return "¡Correcto!. "+tablero.getDescripcion();
        }else{
            //tablero.generarPregunta();
            return "¡Incorrecto!. "+tablero.getDescripcion();
        }
        return "Respuesta No Especificada";
    }

    /**
     * Método para obtener el puntaje actual del jugador en el juego.
     * @return el puntaje actual del jugador en el juego.
     */
    public int obtenerPuntaje(){
        return jugador.getPuntaje();
    }

    /**
     * Método para registrar un nuevo jugador en el juego.
     * @param j el nombre del nuevo jugador a registrar en el juego.
     */
    public void registrarJugador(String j){
        setJugador(new Jugador(j));
    }

    /**
     * Método para generar una nueva pregunta en el juego.
     * @return una nueva pregunta en el juego.
     */
    public Pregunta siguiente(){
        return tablero.generarPregunta();
    }
}
