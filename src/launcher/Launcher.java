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

        if (u != null){
            System.out.println("Seleccione una opcion:\n" +
                    "1. Crear Encuesta.\n" +
                    "2. Responder Encuesta \n" +
                    "3. Salir.");

            int opcionUsuario = input.nextInt();
            while(opcionUsuario != 3) {

                if (opcionUsuario == 1) {
                    FactoryEncuesta factoryEncuesta = new FactoryEncuesta();
                    FactoryPregunta factoryPregunta = new FactoryPregunta(input);
                    Encuesta e = factoryEncuesta.crearEncuesta(input, u);
                    u.addEncuesta(e);
                    sistema.updateEncuestas();
                    System.out.println("Elija el numero de preguntas:\n");
                    int numPreguntas = input.nextInt();
                    for (int i = 0; i < numPreguntas; i++) {
                        System.out.println("Pregunta " + (i + 1) + "\n");
                        System.out.println("Elija el tipo de pregunta: \n" +
                                "1. Texto.\n" +
                                "2. Si/No/Ns\n" +
                                "3. Respuesta Multiple.\n" +
                                "4. Pregunta Matriz.\n");
                        int tipo = input.nextInt();
                        factoryPregunta.crearPregunta(tipo, e);
                    }

                }

                else if(opcionUsuario ==2){
                    System.out.println("Seleccione la encuesta que quiere responder");
                    for (Encuesta e : sistema.getEncuestas()) {
                        
                    }
                }

            }
        }

    }

}
