package modelo;

import java.util.Scanner;

public class FactoryEncuesta {

    public Encuesta crearEncuesta(Scanner input, Usuario usuario){
        System.out.println("Digite un numero de id de la Encuesta:\n");
        int idEncuesta = input.nextInt();
        System.out.println("Digite el titulo de la Encuesta:\n");
        String titulo = input.next();
        Encuesta e = new Encuesta(idEncuesta,usuario, titulo);
        return e;
    }

}
