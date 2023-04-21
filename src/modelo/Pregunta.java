package modelo;

import java.util.ArrayList;

public abstract class Pregunta {

    protected int idEncuesta;
    protected String tipo;
    protected String pregunta;
    protected ArrayList<Respuesta> respuestas;

    public Pregunta(int idEncuesta, String tipo, String pregunta) {
        this.idEncuesta = idEncuesta;
        this.tipo = tipo;
        this.pregunta = pregunta;
        this.respuestas = new ArrayList<Respuesta>();
    }

    public abstract void generarReporte();

    public void addRespuesta(Respuesta r){
        this.respuestas.add(r);
    }

    public int getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
}
