package ppb.grupo13.juegoCapitalesColombia.model;

import javax.json.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Clase para representar una pregunta en el juego "Capitales de Colombia".
 */
public class Pregunta {

    private final String JSON_DPTS = "src/main/resources/ppb/grupo13/juegoCapitalesColombia/JsonFiles/Departamentos.json";
    private String pregunta;
    private String respuestaCorrecta;
    private ArrayList<String> opciones;
    private int puntaje;

    /**
     * Constructor para la clase Pregunta que recibe un departamento.
     * @param departamento el departamento para el cual se genera la pregunta.
     */
    public Pregunta(String departamento) {
        setPregunta("la capital del departamento "+departamento+" es:");
        setRespuestaCorrecta();
        leerOpciones(departamento);
        setPuntaje(10);
    }

    /**
     * Método para obtener la pregunta actual.
     * @return la pregunta actual.
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * Método para establecer la pregunta actual.
     * @param pregunta la pregunta actual.
     */
    private void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * Método para obtener la respuesta correcta a la pregunta actual.
     * @return la respuesta correcta a la pregunta actual.
     */
    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    /**
     * Método para leer las opciones de respuesta a la pregunta actual desde un archivo JSON.
     * @param departamento el departamento para el cual se generan las opciones de respuesta.
     */
    private void leerOpciones(String departamento){

        try {
            File file = new File(JSON_DPTS);
            InputStream inputStream = new FileInputStream(file);

            JsonReader jsonReader = Json.createReader(inputStream);
            JsonObject jsonObjectFile = jsonReader.readObject();

            jsonReader.close();
            inputStream.close();

            JsonArray departamentosArray = jsonObjectFile.getJsonArray("Departamentos");

            opciones = new ArrayList<String>();
            int ran;
            int i;

            while(opciones.size()<4) {
                ran = (int)(Math.random() * 31 + 1);
                i = 0;
                for (JsonValue dep : departamentosArray) {
                    i++;
                    if (respuestaCorrecta == null && dep.asJsonObject().getString("Nombre").equals(departamento)) {
                        respuestaCorrecta = dep.asJsonObject().getString("Capital");
                        opciones.add(respuestaCorrecta);
                        break;
                    } else if (opciones.size()<3 && ran==i &&
                            !opciones.contains(dep.asJsonObject().getString("Capital"))) {
                        opciones.add(dep.asJsonObject().getString("Capital"));
                        break;
                    } else if (respuestaCorrecta != null && opciones.size()<4 && ran==i
                            && !opciones.contains(dep.asJsonObject().getString("Capital"))) {
                        opciones.add(dep.asJsonObject().getString("Capital"));
                        break;
                    }
                    //System.out.println(dep.asJsonObject().getString("Nombre"));
                }
            }

        }catch (Exception e){
            System.out.println("error al leer opciones de pregunta");
            System.out.println("Error en: "+getClass().getName()+" "+e);
        }
    }

    /**
     * Método para establecer la respuesta correcta a la pregunta actual.
     */
    private void setRespuestaCorrecta() {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    /**
     * Método para obtener las opciones de respuesta a la pregunta actual.
     * @return un ArrayList con las opciones de respuesta a la pregunta actual.
     */
    public ArrayList<String> getOpciones() {
        return opciones;
    }
    /**
     * Método para establecer las opciones de respuesta a la pregunta actual.
     * @param respuestas un ArrayList con las opciones de respuesta a la pregunta actual.
     */
    private void setOpciones(ArrayList respuestas) {
        this.opciones = respuestas;
    }

    /**
     * Método para obtener el puntaje que otorga la pregunta actual.
     * @return el puntaje que otorga la pregunta actual.
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * Método para establecer el puntaje que otorga la pregunta actual.
     * @param puntaje el puntaje que otorga la pregunta actual.
     */
    private void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
