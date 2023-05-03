package modelo;

public class RespuestaTexto extends Respuesta{

    private String respuesta;

    public RespuestaTexto(Usuario usuario, Encuesta encuesta, Pregunta pregunta, String respuesta) {
        super(usuario, encuesta, pregunta);
        this.respuesta = respuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
