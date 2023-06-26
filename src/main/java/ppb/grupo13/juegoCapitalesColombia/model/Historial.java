package ppb.grupo13.juegoCapitalesColombia.model;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import javax.json.*;

public class Historial {
    private HashMap<String,Jugador> jugadores;
    private final String JSON_HIST = "src/main/resources/ppb/grupo13/juegoCapitalesColombia/JsonFiles/HistorialPuntaje.json";

    public Historial() {
        if (jugadores == null){
            jugadores = new HashMap<String,Jugador>();
        }
        cargarHistoriaJugadores();
    }

    public void agregarJugador (Jugador j){
        jugadores.put(j.getAlias(),j);
        guardarHistoriaJugadores();
    }

    public Jugador obtenerJugador (String nombre){
        if(jugadores.containsKey(nombre)){
            return jugadores.get(nombre);
        }
        else {
            System.out.println("El jugador "+nombre+" no ha sido ingresado aun");
            return null;
        }
    }

    public boolean eliminarJugador (Jugador j){
        if(jugadores.containsKey(j.getAlias())){
            jugadores.remove(j.getAlias());
            return true;
        }
        else {
            System.out.println("El jugador "+j.getAlias()+" no ha sido ingresado aun");
            return false;
        }
    }

    private void cargarHistoriaJugadores(){

        try {
            File file = new File(JSON_HIST);
            InputStream inputStream = new FileInputStream(file);

            JsonReader jsonReader = Json.createReader(inputStream);
            JsonObject jsonObjectFile = jsonReader.readObject();

            jsonReader.close();
            inputStream.close();

            JsonArray  playersArray = jsonObjectFile.getJsonArray("players");

            for (JsonValue player :playersArray) {
                Jugador j = new Jugador(player.asJsonObject().getString("alias"),player.asJsonObject().getInt("puntaje"));
                jugadores.put(j.getAlias(),j);
            }
            //System.out.println("jugadores: "+jugadores.keySet());
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public TreeMap getPuntajesOrdenados(){
        TreeMap<Integer,String> map = new TreeMap<Integer,String>();

        for (Jugador j:jugadores.values()) {
            map.put(j.getPuntaje(),j.getAlias());
        }

        //System.out.println(map);
        return map;
    }

    private void guardarHistoriaJugadores(){

        try {
            JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
            JsonArrayBuilder arrayPlayerBuilder = Json.createArrayBuilder();
            JsonObjectBuilder playerBuilder = Json.createObjectBuilder();
            JsonObject jsonObject;

            for (Jugador j : jugadores.values()) {
                playerBuilder.add("alias", j.getAlias())
                        .add("puntaje", j.getPuntaje());

                arrayPlayerBuilder.add(playerBuilder);

                playerBuilder = Json.createObjectBuilder();
            }

            objectBuilder.add("players", arrayPlayerBuilder);


            jsonObject = objectBuilder.build();

            File file = new File(JSON_HIST);
            OutputStream outputStream = new FileOutputStream(file);
            JsonWriter jsonWriter = Json.createWriter(outputStream);

            jsonWriter.writeObject(jsonObject);
            jsonWriter.close();
            outputStream.close();
            //System.out.println("jugadores guardados: "+objectBuilder.build());
        }catch(Exception e){
            System.out.println("error al leer el historial de puntajes");
            System.out.println("Error en: "+getClass().getName()+" "+e);
        }
    }




}
