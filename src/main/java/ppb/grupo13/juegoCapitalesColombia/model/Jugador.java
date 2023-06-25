package ppb.grupo13.juegoCapitalesColombia.model;

public class Jugador {

    private String Alias;
    private int puntaje;

    public Jugador(String alias) {
        setAlias(alias);
    }

    public Jugador(String alias, int puntaje) {
        setAlias(alias);
        setPuntaje(puntaje);
    }

    public void sumarPuntaje(int p){
        setPuntaje(getPuntaje()+p);
    }

    public String getAlias() {
        return Alias;
    }

    private void setAlias(String alias) {
        Alias = alias;
    }

    public int getPuntaje() {
        return puntaje;
    }

    private void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
