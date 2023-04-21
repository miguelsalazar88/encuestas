package modelo;

import java.util.ArrayList;

public abstract class Pregunta {

    protected Encuesta encuesta;
    protected String tipo;
    protected String pregunta;
    protected ArrayList<Respuesta> respuestas;

    public Pregunta(Encuesta idEncuesta, String tipo, String pregunta) {
        this.encuesta = idEncuesta;
        this.tipo = tipo;
        this.pregunta = pregunta;
        this.respuestas = new ArrayList<Respuesta>();
    }

    public abstract void generarReporte();

    public void addRespuesta(Respuesta r){
        this.respuestas.add(r);
    }

    public Encuesta getEncuesta() {
        return encuesta;
    }

    public void setEncuesta(Encuesta encuesta) {
        this.encuesta = encuesta;
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
