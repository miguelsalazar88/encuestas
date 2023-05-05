package modelo;


public class Extraer {
	
    public <T> String ExtraerTipo(T t, int a) {
    	
    	Class<? extends Respuesta> temp1 = (Class<? extends Respuesta>) t.getClass();
    	String temp2 = temp1.getName();
    	//Linea que extrae el nombre de la clase. viene en formato Users.Persona, si se cambia el nombre del paquete, cambiar el numero en el substring para arreglar.
    	String temp3 = temp2.substring(a);
    	return temp3;
    }
    
}
