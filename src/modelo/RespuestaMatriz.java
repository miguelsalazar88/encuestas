package modelo;

public class RespuestaMatriz extends Respuesta{

    private int[][] matrizRespuesta;
    
    public RespuestaMatriz(Usuario usuario, Encuesta encuesta, Pregunta pregunta, int[][] matrizRespuesta) {
        super(usuario, encuesta, pregunta);
        this.matrizRespuesta = matrizRespuesta;
    }

    public int[][] getMatrizRespuesta() {
        return matrizRespuesta;
    }

    public void setMatrizRespuesta(int[][] matrizRespuesta) {
        this.matrizRespuesta = matrizRespuesta;
    }
}
