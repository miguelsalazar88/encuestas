package modelo;

import java.util.Scanner;

public class FactoryUsuario {

    private Scanner input;

    public FactoryUsuario(Scanner input) {
        this.input = input;
    }

    public Usuario crearUsuario(){

        System.out.print("Ingrese su nombre: \n");

        String nombre = input.next();

        System.out.print("Ingrese su apellido: \n");

        String apellido = input.next();

        System.out.print("Ingrese su id: \n");

        int id = Integer.parseInt(input.next());

        System.out.print("Ingrese una contraseña: \n");

        String password = input.next();

        return new Usuario(id, password, nombre, apellido);

    }
}
