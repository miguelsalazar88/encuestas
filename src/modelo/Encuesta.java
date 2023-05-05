package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Encuesta {
    private int idEncuesta;
    private String titulo;
    private Usuario owner;
    private ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();

    public Encuesta(int idEncuesta, Usuario owner, String titulo) {
        this.idEncuesta = idEncuesta;
        this.owner = owner;
        this.titulo = titulo;
    }

    public void responder(Scanner input){
        for (Pregunta p: this.getPreguntas()) {
            p.responder(input);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
