package modelo;

import java.util.ArrayList;

public class Usuario {
    private int id;
    private String password;
    private String nombre;
    private String apellido;
    private ArrayList<Encuesta> encuestas;

    public Usuario(int id, String password, String nombre, String apellido) {
        this.id = id;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.encuestas = new ArrayList<Encuesta>();
    }

    public void addEncuesta(Encuesta e){
        this.encuestas.add(e);
    }
}
