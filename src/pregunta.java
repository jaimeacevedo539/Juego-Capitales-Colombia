public class pregunta {

    public String pregunta;
    public String[]opcionMultiple;
    public int opcionCorrecta;

    public pregunta(String pregunta, String []opcionMultiple, int opcionCorrecta) {
        this.pregunta = pregunta;
        this.opcionMultiple = opcionMultiple;
        this.opcionCorrecta = opcionCorrecta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String[] getOpcionMultiple() {
        return opcionMultiple;
    }

    public int getOpcionCorrecta() {
        return opcionCorrecta;
    }
}
