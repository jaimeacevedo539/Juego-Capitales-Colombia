package ppb.grupo13.juegoCapitalesColombia.model;

/**
 * Clase para representar un jugador en el juego "Capitales de Colombia".
 */
public class Jugador {

    private String Alias;
    private int puntaje;

    /**
     * Constructor para la clase Jugador que recibe un alias.
     * @param alias el alias del jugador.
     */
    public Jugador(String alias) {
        setAlias(alias);
    }

    /**
     * Constructor para la clase Jugador que recibe un alias y un puntaje.
     * @param alias el alias del jugador.
     * @param puntaje el puntaje del jugador.
     */
    public Jugador(String alias, int puntaje) {
        setAlias(alias);
        setPuntaje(puntaje);
    }

    /**
     * Método para sumar puntos al puntaje del jugador.
     * @param p la cantidad de puntos a sumar al puntaje del jugador.
     */
    public void sumarPuntaje(int p){
        setPuntaje(getPuntaje()+p);
    }

    /**
     * Método para obtener el alias del jugador.
     * @return el alias del jugador.
     */
    public String getAlias() {
        return Alias;
    }

    /**
     * Método para establecer el alias del jugador.
     * @param alias el alias del jugador.
     */
    private void setAlias(String alias) {
        Alias = alias;
    }

    /**
     * Método para obtener el puntaje del jugador.
     * @return el puntaje del jugador.
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * Método para establecer el puntaje del jugador.
     * @param puntaje el puntaje del jugador.
     */
    private void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
