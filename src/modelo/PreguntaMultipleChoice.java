package modelo;

import java.util.Scanner;

public class PreguntaMultipleChoice extends Pregunta{
    private String[] opciones;

    public PreguntaMultipleChoice(Encuesta idEncuesta, int tipo, String pregunta, String[] opciones) {
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

    @Override
    public Respuesta responder(Scanner input) {
        System.out.println(this.getPregunta()); 
        System.out.println("Opciones:");
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i + 1) + ". " + opciones[i]);
        }
        
        int respuesta = -1;
        while (respuesta < 1 || respuesta > opciones.length) {
            System.out.println("Por favor, ingrese el número correspondiente a su respuesta:");
            if (input.hasNextInt()) {
                respuesta = input.nextInt();
            } else {
                input.next();
            }
        }
        RespuestaMultipleChoice respuestaMultipleChoice = new RespuestaMultipleChoice(getUsuario(), getEncuesta(), this);
        respuestaMultipleChoice.setOpcion(respuesta - 1);

    }
    
}
