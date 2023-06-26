package ppb.grupo13.juegoCapitalesColombia.model;

import javax.json.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;

/**
 * Clase para representar el tablero del juego "Capitales de Colombia".
 */
public class Tablero {

    private final String JSON_DPTS = "src/main/resources/ppb/grupo13/juegoCapitalesColombia/JsonFiles/Departamentos.json";
    private HashMap <Integer,Departamento> departamentos;
    private Departamento depActual;

    /**
     * Constructor por defecto para la clase Tablero.
     */
    public Tablero (){
        leerDepartamentos();
    }

    /**
     * Método para responder a una pregunta en el juego y verificar si es correcta o incorrecta.
     * @param respuesta la respuesta enviada por el usuario.
     * @return verdadero si la respuesta es correcta, falso en caso contrario.
     */
    public boolean responder(String respuesta){
        return  depActual.esRespuestaCorrecta((respuesta));
    }

    /**
     * Método para generar una nueva pregunta en el juego.
     * @return una nueva pregunta en el juego.
     */
    public Pregunta generarPregunta(){
        int ran = (int)(Math.random()*departamentos.size()+1);
        depActual = departamentos.get(ran);
        return depActual.crearPregunta();
    }

    /**
     * Método para obtener el puntaje que otorga la pregunta actual en el juego.
     * @return el puntaje que otorga la pregunta actual en el juego.
     */
    public int obtenerPuntaje(){
        return depActual.getPregunta().getPuntaje();
    }

    /**
     * Método para obtener la descripción del departamento actual en el juego.
     * @return la descripción del departamento actual en el juego.
     */
    public String getDescripcion(){
        return depActual.getDescripcion();
    }
    /**
     * Metodo para obtener la ruta de la imagen del departamento
     */
    public String getRutaImg(){
        return depActual.getRutaImg();
    }

    /**
     * Método para leer los departamentos desde un archivo JSON y cargarlos en el tablero del juego.
     */
    private void leerDepartamentos(){
        try {
            File file = new File(JSON_DPTS);
            InputStream inputStream = new FileInputStream(file);

            JsonReader jsonReader = Json.createReader(inputStream);
            JsonObject jsonObjectFile = jsonReader.readObject();

            jsonReader.close();
            inputStream.close();

            JsonArray departamentosArray = jsonObjectFile.getJsonArray("Departamentos");

            departamentos = new HashMap<>();
            Departamento d;
            int i = 0;

            for (JsonValue dep : departamentosArray) {
                d = new Departamento(dep.asJsonObject().getString("Nombre"),i);
                departamentos.put(i,d);
                i++;

            }

        }catch (Exception e){
            System.out.println("error al leer los departamentos:");
            System.out.println("Error en: "+getClass().getName()+" "+e);
        }
    }
}
