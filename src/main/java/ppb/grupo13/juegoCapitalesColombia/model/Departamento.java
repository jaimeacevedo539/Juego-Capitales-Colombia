package ppb.grupo13.juegoCapitalesColombia.model;

public class Departamento {

    Pregunta pregunta;
    String nombre;
    String capital;
    String region;
    int numero;

    public Departamento(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pregunta crearPregunta(Departamento departamentos){
        //ToDo
        return null;
    }

    public boolean esRespuestaCorrecta(String respuesta){
        //ToDo
        return false;
    }
}
