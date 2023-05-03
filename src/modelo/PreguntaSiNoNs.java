package modelo;

public class PreguntaSiNoNs extends Pregunta{

    public PreguntaSiNoNs(Encuesta idEncuesta, String tipo, String pregunta) {
        super(idEncuesta, tipo, pregunta);
    }

    @Override
    public void generarReporte() {

        if(this.respuestas.size() == 0){
            System.out.println("No hay respuestas guardadas para esta pregunta.");
        }

        int si, no, noSabe = 0;

        for (Respuesta r : this.respuestas) {
            System.out.println("Respuesta");
        }
    }
}
