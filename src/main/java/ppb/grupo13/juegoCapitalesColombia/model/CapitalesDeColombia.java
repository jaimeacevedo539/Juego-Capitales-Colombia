package ppb.grupo13.juegoCapitalesColombia.model;

public class CapitalesDeColombia {

    private Historial historial;
    private Jugador jugador;
    private Tablero tablero;

    public CapitalesDeColombia() {
        setHistorial(new Historial());
        setTablero(new Tablero());
    }

    public CapitalesDeColombia(Historial historial, Tablero tablero) {
        setHistorial(historial);
        setTablero(tablero);
    }

    public Historial getHistorial() {return historial;    }

    private void setHistorial(Historial historial) {
        this.historial = historial;
    }

    public Jugador getJugador() {
        return jugador;
    }

    private void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Tablero getTablero() {
        return tablero;
    }

    private void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public String enviarRespuesta(String respuesta){
        if(tablero.responder(respuesta)){
            jugador.sumarPuntaje(tablero.obtenerPuntaje());
            //tablero.generarPregunta();
            return "¡Correcto!. "+tablero.getDescripcion();
        }else{
            //tablero.generarPregunta();
            return "¡Incorrecto!. "+tablero.getDescripcion();
        }

    }

    public int obtenerPuntaje(){
        return jugador.getPuntaje();
    }

    public void registrarJugador(String j){
        setJugador(new Jugador(j));
    }

    public Pregunta siguiente(){
        return tablero.generarPregunta();
    }
}
