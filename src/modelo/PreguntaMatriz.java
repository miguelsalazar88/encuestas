package modelo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class PreguntaMatriz extends Pregunta{
    private ArrayList<String> enunciados;
    private String[] opciones;

    private ArrayList<ArrayList<Integer>> soluciones=;

    [0"enunciado"][opciones elegidas]

    0=[1-25;2-85,]
    1=[]
    2=[]
    pregunta=0 resultados = [opcion1=###,op]
    3
    a-b-c
    4
    asd
    asdk
            as
    asp

    public PreguntaMatriz(Encuesta idEncuesta, int tipo, String pregunta,
                          String[] filas, String[] columnas) {
        super(idEncuesta, tipo, pregunta);
    }
    public void generarReporte() {
        System.out.println("Reporte Matriz");
    }

    @Override
    public void responder(Scanner input) {
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
            respuestasMatriz.add(new RespuestaMatriz(columnas[opcion - 1]));
        }

        Respuesta respuesta = new RespuestaMatriz(respuestasMatriz);
    }
}
