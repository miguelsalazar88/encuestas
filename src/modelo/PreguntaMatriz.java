package modelo;

import java.util.Scanner;

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
    public void responder(Scanner input) {
    }
}
