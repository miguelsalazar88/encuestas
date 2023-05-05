package modelo;

import java.util.Scanner;

public class PreguntaTexto extends Pregunta{
    public PreguntaTexto(Encuesta encuesta, int tipo, String pregunta) {
        super(encuesta, tipo, pregunta);
    }

    @Override
    public void generarReporte() {
        System.out.println("Reporte de la pregunta:" +
        this.getPregunta());
        for(Respuesta r :super.respuestas)
        {
            System.out.println(r.pregunta+"\n");
        }
    }

    @Override
    public void responder(Scanner input) {
        System.out.println(this.getPregunta());
        System.out.println("Por favor, ingrese su respuesta:");
        String respuesta = input.nextLine();

        RespuestaTexto respuestaTexto = new RespuestaTexto(null,this.encuesta, this, respuesta);
        this.respuestas.add(respuestaTexto);
    }
}
