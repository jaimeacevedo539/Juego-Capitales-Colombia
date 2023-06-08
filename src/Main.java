import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Departamento departamento= new Departamento();
        List<pregunta> preguntas = new ArrayList<>();

        preguntas.add(new pregunta("cual es la capital de COLOMBIA?", new String[]{"Bogota", "cali", "medellin"}, 1));
        preguntas.add(new pregunta("Cual es la capital de ANTIOQUIA?", new String []{"Bogota","Medellin","Arauca"},2));
        preguntas.add(new pregunta("Cual es la capital de TOLIMA?", new String[]{"Amazonas","Barranquilla","Ibague"},3));
        preguntas.add(new pregunta("Cual es la capital de BOLIVAR?", new String[]{"Cartagena","Tunja","Manizales"},1));
        preguntas.add(new pregunta("Cual es la capital de Boyaca?", new String[]{"Cartagena","Tunja","popayan"},2));
        preguntas.add(new pregunta("Cual es la capital de CAQUETA?", new String[]{"Casanare","Tunja","Quibdo"},1));
        preguntas.add(new pregunta("Cual es la capital de CESAR?", new String[]{"yopal","Valledupar","Manizales"},2));
        preguntas.add(new pregunta("Cual es la capital de HUILA?", new String[]{"Rioacha","Santa Marta","Neiva"},3));
        preguntas.add(new pregunta("Cual es la capital de GUANIA?", new String[]{"Neiva","Florencia","Inirida"},3));
        preguntas.add(new pregunta("Cual es la capital de Nariño?", new String[]{"Mocoa","Cucuta","Pasto"},3));

        int puntaje = 0;
        Scanner entrada = new Scanner(System.in);

        for (pregunta pregunta : preguntas) {
            System.out.println(pregunta.getPregunta());
            String[] opcionMultiple = pregunta.getOpcionMultiple();
            for (int i = 0; i < opcionMultiple.length; i++) {
                System.out.println((i + 1) + " " + opcionMultiple[i]);
            }
            System.out.println("Ingrese su respuesta " );
            int respuestaUsuario = entrada.nextInt();

            if (respuestaUsuario   == pregunta.getOpcionCorrecta()) {
                System.out.println("Respuesta correcta");
                puntaje++;

            } else {
                System.out.println("Respuesta incorrecta");
            }
            System.out.println();
        }
        System.out.println("Su puntaje es "+puntaje*10);


    }

}