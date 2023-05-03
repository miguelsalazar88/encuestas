package modelo;

import java.util.ArrayList;

public class Encuesta {
    private int idEncuesta;
    private Usuario owner;
    private ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();

    public Encuesta(int idEncuesta, Usuario ownerId) {
        this.idEncuesta = idEncuesta;
        this.owner = ownerId;
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

    public Usuario getOwner() {
        return owner;
    }

    public void setOwner(Usuario owner) {
        this.owner = owner;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
}
