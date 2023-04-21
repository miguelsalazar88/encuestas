package modelo;

public class PreguntaTexto extends Pregunta{
    public PreguntaTexto(Encuesta idEncuesta, String tipo, String pregunta) {
        super(idEncuesta, tipo, pregunta);
    }

    @Override
    public void generarReporte() {
        System.out.println();
    }
}
