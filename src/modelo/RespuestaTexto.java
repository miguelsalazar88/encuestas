package modelo;

public class RespuestaTexto extends Respuesta{

    private String respuesta;

    public RespuestaTexto(int idusuario, int idEncuesta, int idPregunta, String respuesta) {
        super(idusuario, idEncuesta, idPregunta);
        this.respuesta = respuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
