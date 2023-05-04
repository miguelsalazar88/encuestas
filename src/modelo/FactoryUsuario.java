package modelo;

import java.util.Scanner;

public class FactoryUsuario {

    public FactoryUsuario() {
    }

    public Usuario crearUsuario(){

        Scanner input = new Scanner(System.in);

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
