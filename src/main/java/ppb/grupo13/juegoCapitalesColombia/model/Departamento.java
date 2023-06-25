package ppb.grupo13.juegoCapitalesColombia.model;

import javax.json.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class Departamento {

    private final String JSON_DPTS = "src/main/resources/ppb/grupo13/juegoCapitalesColombia/JsonFiles/Departamentos.json";
    private Pregunta pregunta;
    private String nombre;
    private String capital;
    private String descripcion;
    private int numero;

    public Departamento(String nombre, int numero) {
        setNombre(nombre);
        setNumero(numero);
        leerInformacionDepartamento();
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    private void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    private void setCapital(String capital) {
        this.capital = capital;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String region) {
        this.descripcion = region;
    }
    public int getNumero() {
        return numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    public Pregunta crearPregunta(){
       pregunta = new Pregunta (nombre);
       return pregunta;
    }

    public boolean esRespuestaCorrecta(String respuesta){
        return respuesta.equals(pregunta.getRespuestaCorrecta());
    }

    private void leerInformacionDepartamento(){

        try {
            File file = new File(JSON_DPTS);
            InputStream inputStream = new FileInputStream(file);

            JsonReader jsonReader = Json.createReader(inputStream);
            JsonObject jsonObjectFile = jsonReader.readObject();

            jsonReader.close();
            inputStream.close();

            JsonArray departamentosArray = jsonObjectFile.getJsonArray("Departamentos");

            for (JsonValue dep : departamentosArray) {
                if (dep.asJsonObject().getString("Nombre").equals(nombre)) {
                    setCapital(dep.asJsonObject().getString("Capital"));
                    setDescripcion(dep.asJsonObject().getString("Informacion"));
                    break;
                }
                System.out.println(dep.asJsonObject().getString("Nombre"));
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
