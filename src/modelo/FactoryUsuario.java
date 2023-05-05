package modelo;

import java.util.Scanner;

public class FactoryUsuario {

    private Scanner input;

    public FactoryUsuario(Scanner input) {
        this.input = input;
    }

    public Usuario crearUsuario(){

        System.out.print("Ingrese su nombre: ");

        String nombre = input.nextLine();

        System.out.print("Ingrese su apellido: ");

        String apellido = input.nextLine();

        System.out.print("Ingrese su id: ");

        int id = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese una contraseña: ");

        String password = input.nextLine();

        return new Usuario(id, password, nombre, apellido);

    }
}
