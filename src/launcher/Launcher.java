package launcher;

import modelo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SistemaSingleton sistema = SistemaSingleton.getInstance();

        //SignIn signin = new SignIn();
        Menu menu = new Menu();
        int opcion=0;
        while (opcion !=3) {
            opcion = menu.menuPrincipal(input);
            int acceso = 0;
            if (opcion == 1) {
                if (sistema.getUsuarios().size() > 0) {
                    System.out.println("ID: ");
                    int id = input.nextInt();
                    System.out.println("Contraseña: ");
                    String password;
                    password= "x";//input.nextLine();
                    for (int p=0;p<sistema.getUsuarios().size();p++) {
                        Usuario user = sistema.getUsuarios().get(p);
                        if (user.getId() == id && password.equals(user.getPassword())) {
                            System.out.println(user.toString());
                            acceso = p;
                            break;
                        }
                    }
                    if (acceso != 0) {
                        int opcionUsuario=0;

                        while (opcionUsuario != 3) {
                            System.out.println("Seleccione una opcion:\n" +
                                    "1. Crear Encuesta.\n" +
                                    "2. Responder Encuesta \n" +
                                    "3. Salir.");
                            opcionUsuario = input.nextInt();

                            if (opcionUsuario == 1) {
                                FactoryEncuesta factoryEncuesta = new FactoryEncuesta();
                                FactoryPregunta factoryPregunta = new FactoryPregunta(input);
                                Encuesta e = factoryEncuesta.crearEncuesta
                                        (input,sistema.getUsuarios().get(acceso));
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
                                    e.addPregunta(factoryPregunta.crearPregunta(tipo, e));
                                }
                                sistema.getUsuarios().get(acceso).addEncuesta(e);
                                sistema.updateEncuestas();
                            }

                            if (opcionUsuario == 2) {
                                System.out.println("Seleccione la encuesta que quiere responder");
                                for (int j = 0; j < sistema.getEncuestas().size(); j++) {
                                    System.out.println(j + ". Para la encuesta:" + sistema.getEncuestas().get(j).getTitulo());
                                }
                                int encuestaElegida = input.nextInt();
                                Encuesta encuesta_a_responder = sistema.getEncuestas().get(encuestaElegida);
                                System.out.println("Bienvenido a responder la encuesta:" +
                                        encuesta_a_responder.getTitulo());
                                for (int y = 0; y < encuesta_a_responder.getPreguntas().size(); y++) {
                                    System.out.println("Pregunta numero:" + (y + 1) +
                                            "\n" + encuesta_a_responder.getPreguntas().get(y) + "\n");
                                    encuesta_a_responder.getPreguntas().get(y).responder(input);
                                }
                                sistema.getEncuestas().set(encuestaElegida, encuesta_a_responder);
                                System.out.println("Gracias por su respuesta \n Resumen de sus respuestas: " +
                                        "\n" + sistema.getEncuestas().get(encuestaElegida).toString());
                            }

                        }
                        //u = signin.verificar(id, password);
                    } else {
                        System.out.println("Datos erroneos");
                    }
                } else {
                    System.out.println("Sin usuarios registrados");
                }
            }
            if (opcion == 2) {
                FactoryUsuario factoryUsuario = new FactoryUsuario(input);
                sistema.addUsuario(factoryUsuario.crearUsuario());
                System.out.println("Usuario Creado con exito \n");
            }
        }
    }
}
