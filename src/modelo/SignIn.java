package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SignIn {

    private String archivo;

    public SignIn() {
        this.archivo = "dataBase/usuarios.txt";
    }

    public Usuario verificar(int id, String password) {
        boolean encontrado = false;
        BufferedReader lector = null;

        try {
            lector = new BufferedReader(new FileReader(this.archivo));
            String linea;

            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(",");
                int idEnArchivo = Integer.parseInt(partes[0].trim());
                String passwordEnArchivo = partes[1].trim();

                if (id == idEnArchivo && password.equals(passwordEnArchivo)) {
                    encontrado = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (lector != null) lector.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return new Usuario(1020737639,"miguel123","Miguel","Salazar");
    }
}