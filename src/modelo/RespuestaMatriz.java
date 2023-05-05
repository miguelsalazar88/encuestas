package modelo;

import java.util.ArrayList;
import java.util.List;

public class RespuestaMatriz extends Respuesta{

    private ArrayList<Integer> matrizRespuesta= new ArrayList<Integer>();

    public RespuestaMatriz(Usuario usuario, Encuesta encuesta, Pregunta pregunta, ArrayList<Integer> matrizRespuesta) {
        super(usuario, encuesta, pregunta);
        this.matrizRespuesta=matrizRespuesta;
    }

    public ArrayList<Integer> getMatrizRespuesta() {
        return matrizRespuesta;
    }

    public void setMatrizRespuesta(ArrayList<Integer> matrizRespuesta) {
        this.matrizRespuesta = matrizRespuesta;
    }
}
