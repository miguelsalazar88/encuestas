package modelo;

public class RespuestaMultipleChoice extends Respuesta{

    private int opcion;

    public RespuestaMultipleChoice(Usuario usuario, Encuesta encuesta, Pregunta pregunta, int opcion) {
        super(usuario, encuesta, pregunta);
        this.opcion = opcion;
    }

}
