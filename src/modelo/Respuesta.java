package modelo;

public abstract class Respuesta {

    protected int idusuario;
    protected int idEncuesta;
    protected int idPregunta;
    public Respuesta(int idusuario, int idEncuesta, int idPregunta) {
        this.idusuario = idusuario;
        this.idEncuesta = idEncuesta;
        this.idPregunta = idPregunta;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }
}
