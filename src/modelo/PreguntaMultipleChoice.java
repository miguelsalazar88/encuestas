package modelo;

public class PreguntaMultipleChoice extends Pregunta{
    private String[] opciones;

    public PreguntaMultipleChoice(Encuesta idEncuesta, String tipo, String pregunta, String[] opciones) {
        super(idEncuesta, tipo, pregunta);
        this.opciones = opciones;
    }

    @Override
    public void generarReporte() {
        System.out.println("Reporte");
    }

    public String[] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }
}
