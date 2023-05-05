package modelo;

import java.util.Scanner;

public class PreguntaTexto extends Pregunta{
    public PreguntaTexto(Encuesta encuesta, int tipo, String pregunta) {
        super(encuesta, tipo, pregunta);
    }

    @Override
    public void generarReporte() {
        System.out.println();
    }

    @Override
    public Respuesta responder(Scanner input) {
        return null;
    }
}
