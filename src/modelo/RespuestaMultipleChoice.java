package modelo;

public class RespuestaMultipleChoice extends Respuesta{

    private int opcion;

    public RespuestaMultipleChoice(Usuario usuario, Encuesta encuesta, Pregunta pregunta, int opcion) {
        super(usuario, encuesta, pregunta);
        this.opcion = opcion;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    
}
