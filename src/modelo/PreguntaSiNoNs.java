package modelo;

import java.util.Scanner;
import modelo.Respuesta;

public class PreguntaSiNoNs extends Pregunta{

    public PreguntaSiNoNs(Encuesta idEncuesta, int tipo, String pregunta) {
        super(idEncuesta, tipo, pregunta);
    }

    @Override
    public void generarReporte() {

        System.out.println(this.toString());

        if (this.respuestas.size() == 0) {
            System.out.println("No hay respuestas guardadas para esta pregunta.");
        } else {
            int si = 0, no = 0, noSabe = 0;

            for (Respuesta r : this.respuestas) {
                if (((RespuestaSiNo) r).getSiNoNs() == 0) {
                    si += 1;
                } else if (((RespuestaSiNo) r).getSiNoNs() == 1) {
                    no += 1;
                } else {
                    noSabe += 1;
                }
            }

            System.out.println("Reporte Generado:");
            System.out.println("Si: " + si);
            System.out.println("No: " + no);
            System.out.println("No sabe: " + noSabe);
        }
    }
    @Override
    public void responder(Scanner input) {
        System.out.println(this.getPregunta()); 
        System.out.println("Por favor, ingrese su respuesta (s/n/ns):");
        String respuesta = input.nextLine();

        int siNoNs = -1; 
        if (respuesta.equalsIgnoreCase("s")) {
            siNoNs = 0; 
        } else if (respuesta.equalsIgnoreCase("n")) {
            siNoNs = 1; 
        } else if (respuesta.equalsIgnoreCase("ns")) {
            siNoNs = 2; 
        }

        RespuestaSiNo respuestaSiNo = new RespuestaSiNo(null,this.encuesta, this);
        respuestaSiNo.setSiNoNs(siNoNs);
        this.respuestas.add(respuestaSiNo);
    }


}
