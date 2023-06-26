package ppb.grupo13.juegoCapitalesColombia.model;

import javax.json.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;

public class Tablero {

    private final String JSON_DPTS = "src/main/resources/ppb/grupo13/juegoCapitalesColombia/JsonFiles/Departamentos.json";
    private HashMap <Integer,Departamento> departamentos;
    private Departamento depActual;

    public Tablero (){
        leerDepartamentos();
    }

    public boolean responder(String respuesta){
        return  depActual.esRespuestaCorrecta((respuesta));
    }

    public Pregunta generarPregunta(){
        int ran = (int)(Math.random()*departamentos.size()+1);
        depActual = departamentos.get(ran);
        return depActual.crearPregunta();
    }

    public int obtenerPuntaje(){
        return depActual.getPregunta().getPuntaje();
    }

    public String getDescripcion(){
        return depActual.getDescripcion();
    }

    public String getRutaImg(){
        return depActual.getRutaImg();
    }


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
                //System.out.println(i+dep.asJsonObject().getString("Nombre"));
            }
            System.out.println("cargue deps finalizada");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
