package ppb.grupo13.juegoCapitalesColombia.model;

public class CapitalesDeColombia {

    Historial historial;
    Jugador jugador;
    Tablero tablero;

    public CapitalesDeColombia() {
        setHistoria(new Historial());
        setTablero(new Tablero());
    }

    public CapitalesDeColombia(Historial historial, Tablero tablero) {
        setHistoria(historial);
        setTablero(tablero);
    }

    public Historial getHistorial() {
        return historial;
    }

    private void setHistorial(Historial historial) {
        this.historial = historia;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Tablero getTablero() {
        return tablero;
    }

    private void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public boolean enviarRespuesta(String respuesta){
        //ToDo
        return false;
    }

    public int obtenerPuntaje(){
        //ToDo
        return 0;
    }

    public void registrarJugador(Jugador j){
        //ToDo
    }

    public void crearTablero(){
        //ToDo
    }
}
