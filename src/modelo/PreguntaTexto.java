package modelo;

public class PreguntaTexto extends Pregunta{
    public PreguntaTexto(int idEncuesta, String tipo, String pregunta) {
        super(idEncuesta, tipo, pregunta);
    }

    @Override
    public void generarReporte() {
        System.out.println();
    }
}
