package modelo;

public class RespuestaMultipleChoice extends Respuesta{

    private Integer opcion;
    
    private Boolean marcado;

	public RespuestaMultipleChoice(Usuario usuario, Encuesta encuesta, Pregunta pregunta, Integer opcion) {
        super(usuario, encuesta, pregunta);
        this.opcion = opcion;
    }

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

	

}
