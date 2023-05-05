package launcher;

import modelo.*;

import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        Usuario u = null;
        SistemaSingleton sistema = SistemaSingleton.getInstance();
        Scanner input = new Scanner(System.in);
        SignIn signin = new SignIn();
        Menu menu = new Menu();
        int opcion = menu.menuPrincipal(input);

        if(opcion == 1){
            System.out.println("ID: ");
            int id = input.nextInt();
            System.out.println("Contraseña: ");
            String password = input.nextLine();
            u = signin.verificar(id, password);

        }

        if(opcion == 2){
            FactoryUsuario factoryUsuario = new FactoryUsuario(input);
            u = factoryUsuario.crearUsuario();

        }





    }

}
