package modelo;

public abstract class Respuesta {

    protected Usuario usuario;
    protected Encuesta encuesta;
    protected Pregunta pregunta;
    public Respuesta(Usuario usuario, Encuesta encuesta, Pregunta pregunta) {
        this.usuario = usuario;
        this.encuesta = encuesta;
        this.pregunta = pregunta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Encuesta getEncuesta() {
        return encuesta;
    }

    public void setEncuesta(Encuesta encuesta) {
        this.encuesta = encuesta;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta idPregunta) {
        this.pregunta = idPregunta;
    }

    @Override
    public String toString() {
        return "Para la pregunta " +
                "pregunta=" + this.pregunta.getPregunta() +
                '}';
    }
}
