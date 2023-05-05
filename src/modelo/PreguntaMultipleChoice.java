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

    @Override
    public void responder(Scanner input) {

    }

    public String[] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }
}
