package modelo;

import java.util.ArrayList;

public class Encuesta {
    private int idEncuesta;
    private int ownerId;
    private ArrayList<Pregunta> preguntas;

    public Encuesta(int idEncuesta, int ownerId, ArrayList<Pregunta> preguntas) {
        this.idEncuesta = idEncuesta;
        this.ownerId = ownerId;
        this.preguntas = preguntas;
    }

    public void addPregunta(Pregunta p){
        this.preguntas.add(p);
    }

    public int getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
}
