package ppb.grupo13.juegoCapitalesColombia.model;

import javax.json.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class Pregunta {

    private final String JSON_DPTS = "src/main/resources/ppb/grupo13/juegoCapitalesColombia/JsonFiles/Departamentos.json";
    private String pregunta;
    private String respuestaCorrecta;
    private ArrayList<String> opciones;
    private int puntaje;

    public Pregunta(String departamento) {
        setPregunta("la capital del departamento "+departamento+" es:");
        setRespuestaCorrecta();
        leerOpciones(departamento);
        setPuntaje(10);
    }

    public String getPregunta() {
        return pregunta;
    }

    private void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void leerOpciones(String departamento){

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
            System.out.println(e);
        }
    }

    private void setRespuestaCorrecta() {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public ArrayList getOpciones() {
        return opciones;
    }

    private void setOpciones(ArrayList respuestas) {
        this.opciones = respuestas;
    }

    public int getPuntaje() {
        return puntaje;
    }

    private void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
