package modelo;

import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    public int menuPrincipal(Scanner input){

        System.out.println("Bienvenido al Sistema, Elija una opcion:\n" +
                "1. Iniciar Sesion.\n" +
                "2. Crear Usuario");
        int opcion = input.nextInt();
        return opcion;
    }

}
