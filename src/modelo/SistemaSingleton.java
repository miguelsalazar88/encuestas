package modelo;

import java.util.ArrayList;

import java.util.ArrayList;

public class SistemaSingleton {
    // atributos
    private ArrayList<Usuario> usuarios;
    private ArrayList<Encuesta> encuestas;
    private static SistemaSingleton instancia;

    // constructor privado
    private SistemaSingleton() {
        usuarios = new ArrayList<Usuario>();
        encuestas = new ArrayList<Encuesta>();
    }

    // método para obtener la instancia singleton
    public static SistemaSingleton getInstance() {
        if (instancia == null) {
            instancia = new SistemaSingleton();
        }
        return instancia;
    }
    
    public void addUsuario(Usuario u){
        this.usuarios.add(u);
    }
    
    public void updateEncuestas(){
        this.encuestas.clear();
        for (Usuario u : this.usuarios) {
            for (Encuesta e : u.getEncuestas()) {
                this.encuestas.add(e);
            }
        }
    }

    // getters y setters
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Encuesta> getEncuestas() {
        return encuestas;
    }

    public void setEncuestas(ArrayList<Encuesta> encuestas) {
        this.encuestas = encuestas;
    }
}

