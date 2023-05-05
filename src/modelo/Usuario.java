package modelo;

import java.util.ArrayList;

public class Usuario {
    private int id;
    private String password;
    private String nombre;
    private String apellido;
    private ArrayList<Encuesta> encuestas = new ArrayList<Encuesta>();

    public Usuario(int id, String password, String nombre, String apellido) {
        this.id = id;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Usuario(){}

    public void addEncuesta(Encuesta e){
        this.encuestas.add(e);
    }

    public ArrayList<Encuesta> getEncuestas() {
        return encuestas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEncuestas(ArrayList<Encuesta> encuestas) {
        this.encuestas = encuestas;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", encuestas=" + encuestas +
                '}';
    }
}
