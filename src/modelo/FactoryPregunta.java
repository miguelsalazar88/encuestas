package modelo;

import java.util.Scanner;

public class FactoryPregunta {

    Scanner input;

    public FactoryPregunta(Scanner input) {
        this.input = input;
    }

    public void crearPregunta(int tipo, Encuesta e){
        Pregunta p = null;
        if(tipo == 1){
            p = crearPreguntaTexto(e);
        }
        else if(tipo == 2){
            p = crearPreguntaSiNoNs(e);
        }
        else if (tipo == 3) {
            p = crearPreguntaMultipleChoice(e);
        } else if (tipo == 4) {
            p = crearPreguntaMatriz(e);
        }

        e.addPregunta(p);
    }

    private PreguntaMatriz crearPreguntaMatriz(Encuesta e) {
        System.out.println("Escriba el título de la pregunta: \n");
        String pregunta = input.nextLine();
        System.out.println("Escriba el numero de filas: \n");
        int numFilas = input.nextInt();
        String[] filas = new String[numFilas];
        for (int i = 0; i < numFilas; i++) {
            System.out.println("Escriba la fila " + (i+1) + ": ");
            filas[i] = input.nextLine();
        }
        System.out.println("Escriba el numero de columnas: \n");
        int numColumnas = input.nextInt();
        String[] columnas = new String[numColumnas];
        for (int i = 0; i < numColumnas; i++) {
            System.out.println("Escriba la fila " + (i+1) + ": ");
            columnas[i] = input.nextLine();
        }

        return new PreguntaMatriz(e,4,pregunta,filas, columnas);

    }

    private PreguntaMultipleChoice crearPreguntaMultipleChoice(Encuesta e) {
        System.out.println("Escriba el título de la pregunta: \n");
        String pregunta = input.nextLine();
        System.out.println("Escriba el numero de opciones: \n");
        int numOpciones = input.nextInt();
        String[] opciones = new String[numOpciones];
        for (int i = 0; i < numOpciones; i++) {
            System.out.println("Escriba la opcion " + (i+1) + ": ");
            opciones[i] = input.nextLine();
        }
        return new PreguntaMultipleChoice(e,3,pregunta, opciones);
    }

    public PreguntaSiNoNs crearPreguntaSiNoNs(Encuesta e) {
        System.out.println("Escriba el título de la pregunta: \n");
        String pregunta = input.nextLine();
        return new PreguntaSiNoNs(e,2,pregunta);
    }

    public PreguntaTexto crearPreguntaTexto(Encuesta e) {
        System.out.println("Escriba el título de la pregunta: \n");
        String pregunta = input.nextLine();
        return new PreguntaTexto(e,1,pregunta);
    }


}
