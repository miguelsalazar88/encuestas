package modelo;

public class RespuestaMultipleChoice extends Respuesta{

    private Integer opcion;
    
    private Boolean marcado;

	public RespuestaMultipleChoice(Usuario usuario, Encuesta encuesta, Pregunta pregunta, Integer opcion) {
        super(usuario, encuesta, pregunta);
        this.opcion = opcion;
    }

<<<<<<< HEAD
    public Integer getOpcion() {
		return opcion;
	}


	public void setOpcion(Integer opcion) {
		this.opcion = opcion;
	}

	public Boolean getMarcado() {
		return marcado;
	}

	public void setMarcado(Boolean marcado) {
		this.marcado = marcado;
	}

	

=======
    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    
>>>>>>> alejo
}
