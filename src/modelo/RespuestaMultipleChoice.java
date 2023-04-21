package modelo;

public class RespuestaMultipleChoice extends Respuesta{

    private int opcion;

    public RespuestaMultipleChoice(int idusuario, int idEncuesta, int idPregunta, int opcion) {
        super(idusuario, idEncuesta, idPregunta);
        this.opcion = opcion;
    }

}
