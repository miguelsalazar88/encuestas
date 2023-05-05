package modelo;

public class PreguntaSiNoNs extends Pregunta{

    public PreguntaSiNoNs(Encuesta idEncuesta, int tipo, String pregunta) {
        super(idEncuesta, tipo, pregunta);
    }

    @Override
    public void generarReporte() {

        System.out.println(this.toString());

        if(this.respuestas.size() == 0){
            System.out.println("No hay respuestas guardadas para esta pregunta.");
        }

        int si = 0, no = 0, noSabe = 0;

        for (Respuesta r : this.respuestas) {
            if(((RespuestaSiNo) r).getSiNoNs() == 0){
                si += 1;
            } else if (((RespuestaSiNo) r).getSiNoNs() == 1) {
                no += 1;
            }
            else{
                noSabe += 1;
            }
        }

        System.out.println("Reporte Generado:");
        System.out.println("Si: " + si);
        System.out.println("No: " + no);
        System.out.println("No sabe: " + noSabe);
    }
}
