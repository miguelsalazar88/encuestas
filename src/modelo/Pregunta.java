package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Pregunta {

    protected Encuesta encuesta;
    // Tipos de pregunta: 1. Texto 2. Si/No/NoSabe 3. MultipleChoice 4. Matriz
    protected int tipo;

    protected String pregunta;
    protected ArrayList<Respuesta> respuestas = new ArrayList<Respuesta>();

    public Pregunta(Encuesta idEncuesta, int tipo, String pregunta) {
        this.encuesta = idEncuesta;
        this.tipo = tipo;
        this.pregunta = pregunta;
    }

    public abstract void generarReporte();
    public abstract Respuesta responder(Scanner input);

    public void addRespuesta(Respuesta r){
        this.respuestas.add(r);
    }

    public Encuesta getEncuesta() {
        return encuesta;
    }

    public void setEncuesta(Encuesta encuesta) {
        this.encuesta = encuesta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    @Override
    public String toString() {
        return "Pregunta: " + pregunta + '\n' +
                "Numero de Respuestas: " + respuestas.size() + "\n";
    }
}
