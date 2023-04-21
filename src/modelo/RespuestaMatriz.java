package modelo;

public class RespuestaMatriz extends Respuesta{

    private boolean[][] matrizRespuesta;

    public RespuestaMatriz(int idusuario, int idEncuesta, int idPregunta, boolean[][] matrizRespuesta) {
        super(idusuario, idEncuesta, idPregunta);
        this.matrizRespuesta = matrizRespuesta;
    }

    public boolean[][] getMatrizRespuesta() {
        return matrizRespuesta;
    }

    public void setMatrizRespuesta(boolean[][] matrizRespuesta) {
        this.matrizRespuesta = matrizRespuesta;
    }
}
