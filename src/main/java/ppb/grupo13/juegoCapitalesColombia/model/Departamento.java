package ppb.grupo13.juegoCapitalesColombia.model;

import javax.json.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Clase para representar un departamento en el juego "Capitales de Colombia".
 */
public class Departamento {

    private final String JSON_DPTS = "src/main/resources/ppb/grupo13/juegoCapitalesColombia/JsonFiles/Departamentos.json";
    private Pregunta pregunta;
    private String nombre;
    private String capital;
    private String descripcion;
    private int numero;

    /**
     * Constructor para la clase Departamento que recibe un nombre y un número.
     * @param nombre el nombre del departamento.
     * @param numero el número del departamento.
     */
    public Departamento(String nombre, int numero) {
        setNombre(nombre);
        setNumero(numero);
        leerInformacionDepartamento();
    }

    /**
     * Método para obtener la pregunta actual del departamento.
     * @return la pregunta actual del departamento.
     */
    public Pregunta getPregunta() {
        return pregunta;
    }

    /**
     * Método para establecer la pregunta actual del departamento.
     * @param pregunta la pregunta actual del departamento.
     */
    private void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * Método para obtener el nombre del departamento.
     * @return el nombre del departamento.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del departamento.
     * @param nombre el nombre del departamento.
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la capital del departamento.
     * @return la capital del departamento.
     */
    public String getCapital() {
        return capital;
    }

    /**
     * Método para establecer la capital del departamento.
     * @param capital la capital del departamento.
     */
    private void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     * Método para obtener la descripción del departamento.
     * @return la descripción del departamento.
     */
    public String getDescripcion() {
        return descripcion;
        /**
         * Método para establecer la descripción del departamento.
         * @param descripcion la descripción del departamento.
         */
        private void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        /**
         * Método para obtener el número del departamento.
         * @return el número del departamento.
         */
        public int getNumero() {
            return numero;
        }

        /**
         * Método para establecer el número del departamento.
         * @param numero el número del departamento.
         */
        private void setNumero(int numero) {
            this.numero = numero;
        }

        /**
         * Método para crear una nueva pregunta para el departamento.
         * @return una nueva pregunta para el departamento.
         */
        public Pregunta crearPregunta(){
            pregunta = new Pregunta (nombre);
            return pregunta;
        }

        /**
         * Método para verificar si una respuesta es correcta o incorrecta.
         * @param respuesta la respuesta enviada por el usuario.
         * @return verdadero si la respuesta es correcta, falso en caso contrario.
         */
        public boolean esRespuestaCorrecta(String respuesta){
            return respuesta.equals(pregunta.getRespuestaCorrecta());
        }

        /**
         * Método para leer información del departamento desde un archivo JSON.
         */
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
                    //System.out.println(dep.asJsonObject().getString("Nombre"));
                }

            }catch (Exception e){
                System.out.println(e.toString());
            }
        }
    }
