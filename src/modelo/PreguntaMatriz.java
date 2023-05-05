package modelo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class PreguntaMatriz extends Pregunta{
    private String[] filas;
    private String[] columnas;

    public PreguntaMatriz(Encuesta idEncuesta, int tipo, String pregunta,
                          String[] filas, String[] columnas) {
        super(idEncuesta, tipo, pregunta);
        this.filas = filas;
        this.columnas = columnas;
    }

    public String[] getFilas() {
        return filas;
    }

    public void setFilas(String[] filas) {
        this.filas = filas;
    }

    public String[] getColumnas() {
        return columnas;
    }

    public void setColumnas(String[] columnas) {
        this.columnas = columnas;
    }

    @Override
    public void generarReporte() {
        System.out.println("Reporte");
    }

    @Override
    public Respuesta responder(Scanner input) {
        List<RespuestaMatriz> respuestasMatriz = new ArrayList<>();

        System.out.println(this.getPregunta());
        for (String fila : filas) {
            System.out.println(fila);
            for (int i = 0; i < columnas.length; i++) {
                System.out.print(i + 1 + ". " + columnas[i] + " ");
            }
            System.out.print("\nElija una opción: ");
            int opcion = input.nextInt();
            input.nextLine();
            respuestasMatriz.add(new RespuestaMatriz(fila, columnas[opcion - 1]));
        }

        Respuesta respuesta = new RespuestaMatriz(respuestasMatriz);
    }
}
